package patterns.creational.singleton;

public class EagerRegistry {

    @SuppressWarnings("InstantiationOfUtilityClass")
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
