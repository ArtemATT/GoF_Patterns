package patterns.creational.singleton;

public class LazyInitializationHolder {

    private LazyInitializationHolder() {
    }

    private static class RegistryHolder {
        @SuppressWarnings("InstantiationOfUtilityClass")
        private static final LazyInitializationHolder INSTANCE = new LazyInitializationHolder();
    }

    public static LazyInitializationHolder getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
