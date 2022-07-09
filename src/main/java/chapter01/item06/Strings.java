package chapter01.item06;

public class Strings {

    public static void main(String[] args) {
        String example = "example";
        String example2 = new String("example");
        String example3 = "example";

        System.out.println(example == example2);
        System.out.println(example.equals(example2));
        System.out.println(example == example3);
    }
}
