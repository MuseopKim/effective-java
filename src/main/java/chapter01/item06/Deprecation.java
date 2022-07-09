package chapter01.item06;

public class Deprecation {

    /**
     * @deprecated
     */
    @Deprecated(forRemoval = true, since = "version")
    public Deprecation() {
    }

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }
}
