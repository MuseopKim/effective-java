package chapter01.item08.outerclass;

import java.lang.reflect.Field;

public class OuterClass {

    class InnerClass {

    }

    private void printField() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println("field type: " + field.getType());
            System.out.println("field name: " + field.getName());
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        System.out.println(innerClass);

        outerClass.printField();
    }
}
