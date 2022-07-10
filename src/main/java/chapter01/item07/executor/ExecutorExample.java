package chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();
        ExecutorService fixedService = Executors.newFixedThreadPool(numberOfCpu);
        ExecutorService cachedService = Executors.newCachedThreadPool();
        ExecutorService singleService = Executors.newSingleThreadExecutor();
        ExecutorService scheduledService = Executors.newScheduledThreadPool(10);
        for (int i = 0; i < 100; i++) {
            fixedService.submit(new Task());
        }

        System.out.println(Thread.currentThread() + " hello");

        fixedService.shutdown();

        Future<String> submit = fixedService.submit(new CallableTask());

        System.out.println(Thread.currentThread() + " hello");

        System.out.println(submit.get());   // blocking call
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread() + " world");
        }
    }

    static class CallableTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }
}
