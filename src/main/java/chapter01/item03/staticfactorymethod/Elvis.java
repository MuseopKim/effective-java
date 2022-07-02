package chapter01.item03.staticfactorymethod;

public class Elvis implements Singer {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void sing() {
        System.out.println("I'm singing~!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.sing();

        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }
}
