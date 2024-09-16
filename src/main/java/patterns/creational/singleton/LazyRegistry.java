package patterns.creational.singleton;

public class LazyRegistry {

    private static volatile LazyRegistry instance;

    private LazyRegistry() {
    }

    public static LazyRegistry getInstance() {
        if (instance == null) {
            synchronized (LazyRegistry.class) {
                if (instance == null) {
                    //noinspection InstantiationOfUtilityClass
                    instance = new LazyRegistry();
                }
            }
        }
        return instance;
    }
}
