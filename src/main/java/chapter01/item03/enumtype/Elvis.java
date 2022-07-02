package chapter01.item03.enumtype;

public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("leave the building");
    }

    public static void main(String[] args) {
        INSTANCE.leaveTheBuilding();
    }
}
