package pionpill.algorithm.utils;

public class CheckUtils {
    public static boolean isSorted(Comparable[] collection) {
        for (int i =0; i < collection.length -1; ++i) {
            if (MathUtils.isBig(collection[i], collection[i+1])) {
                return false;
            }
        }
        return true;
    }
}
