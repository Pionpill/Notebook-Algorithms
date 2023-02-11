package pionpill.algorithm.utils;

public class CollectionUtils {
    public static void exchange(Comparable[] collection, int i, int j) {
        if (i==j) return;
        Comparable t = collection[i];
        collection[i] = collection[j];
        collection[j] = t;
    }
}
