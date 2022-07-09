package chapter01.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    public static boolean isRomanNumeralSlow(String str) {
        return str.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN_PATTERN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    public static boolean isRomanNumeralFast(String str) {
        return ROMAN_PATTERN.matcher(str).matches();
    }

    public static void main(String[] args) {
        boolean result = false;

        long start = System.nanoTime();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            result = isRomanNumeralSlow("MLMXXVI");
        }
        long end = System.nanoTime();

        System.out.println(end - start);
        System.out.println(result);
    }
}
