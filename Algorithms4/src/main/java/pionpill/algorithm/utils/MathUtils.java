package pionpill.algorithm.utils;

public class MathUtils {
    public static boolean isLess(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static boolean isBig(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isEqual(Comparable a, Comparable b) {
        return a.compareTo(b) == 0;
    }

    public static boolean isLessEqual(Comparable a, Comparable b) {
        return a.compareTo(b) <= 0;
    }

    public static boolean isBigEqual(Comparable a, Comparable b) {
        return a.compareTo(b) >= 0;
    }
}
