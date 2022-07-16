package chapter01.item08.cleaner;

import chapter01.item08.cleaner.BigObject.ResourceCleaner;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerIsNotGood {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<Object> resourceToCleanUp = new ArrayList<>();
        BigObject bigObject = new BigObject(resourceToCleanUp);

        cleaner.register(bigObject, new ResourceCleaner(resourceToCleanUp));
        bigObject = null;
        System.gc();
        Thread.sleep(3000L);
    }
}
