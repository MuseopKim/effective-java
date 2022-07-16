package chapter01.item08.autoclosable;

public class App {

    public static void main(String[] args) {
        try (AutoClosableIsGood good = new AutoClosableIsGood()) {

        }
    }
}
