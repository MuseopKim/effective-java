package chapter01.item03.staticfactorymethod;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() {
    }

    public static <T> MetaElvis<T> getInstance() {
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    }
}
