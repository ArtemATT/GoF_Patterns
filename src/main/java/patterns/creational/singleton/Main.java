package patterns.creational.singleton;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        printHash(() -> EagerRegistry.getInstance().hashCode(), "Eager Registry: ");
        printHash(() -> LazyRegistry.getInstance().hashCode(), "Lazy Registry: ");
        printHash(() -> LazyInitializationHolder.getInstance().hashCode(), "Lazy Initialization Holder: ");
        printHash(EnumRegistry.INSTANCE::hashCode, "Enum Registry: ");
    }

    private static void printHash(IntSupplier supplier, String msg) {
        IntStream.range(0, 3).forEach(i -> System.out.println(msg + supplier.getAsInt()));
        System.out.println("*".repeat(15));
    }
}
