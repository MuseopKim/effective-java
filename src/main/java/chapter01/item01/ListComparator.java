package chapter01.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparator {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
        numbers.add(7);
        numbers.add(100);

        System.out.println(numbers);

        Comparator<Integer> desc = (number1, number2) -> number2 - number1;

        Collections.sort(numbers, desc);

        System.out.println(numbers);

        numbers.sort(desc.reversed());

        System.out.println(numbers);
    }
}
