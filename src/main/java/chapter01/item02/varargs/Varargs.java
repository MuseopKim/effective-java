package chapter01.item02.varargs;

import java.util.Arrays;

public class Varargs {

    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());  // 배열
        System.out.println(numbers.getClass().getComponentType());  // 타입
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Varargs varArgs = new Varargs();
        varArgs.printNumbers(1, 2, 3, 4, 5);
    }
}
