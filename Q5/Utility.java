
package Q5;

import java.util.Objects;
import java.util.Optional;

public class Utility {

    public static <T> boolean isEqual(T a, T b) {
        return Objects.equals(a, b);
    }

    public static <T> T getDefault(
            Optional<T> value, T defaultValue) {
        return value.orElse(defaultValue);
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        Objects.requireNonNull(a, "First value cannot be null");
        Objects.requireNonNull(b, "Second value cannot be null");

        if (a.compareTo(b) >= 0) {
            return a;
        }

        return b;
    }

    public static boolean isNull(Object obj) {
        return Objects.isNull(obj);
    }
}
