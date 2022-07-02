package chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("can not be created by constructor.");
        }

        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("leave the building");
    }

    public void sing() {
        System.out.println("I'm singing~!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
