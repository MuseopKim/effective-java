package chapter01.item02.freeze;

import java.util.List;

public class Person {

    private String name;

    private int birthYear;

    private List<String> kids;

    private boolean frozen;

    public Person(String name, int birthYear, List<String> kids) {
        this.name = name;
        this.birthYear = birthYear;
        this.kids = kids;
    }

    public void setName(String name) {
        checkIfObjectIsFrozen();
        this.name = name;
    }

    private void checkIfObjectIsFrozen() {
        if (this.frozen) {
            throw new IllegalStateException();
        }
    }
}
