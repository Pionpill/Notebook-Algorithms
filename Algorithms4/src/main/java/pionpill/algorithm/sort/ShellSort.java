package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.MathUtils;

public class ShellSort {
    public static void shellSort(Comparable[] a) {
        int h = 1;
        while (h < a.length / 3) h = h * 3 + 1;
        while (h >= 1) {
            stepSort(a, h);
            h = h / 3;
        }
    }

    private static void stepSort(Comparable[] a, int h) {
        for (int i = h; i < a.length; i++) {
            int j = i;
            while (j >= h && MathUtils.isBig(a[j - h], a[j])) {
                CollectionUtils.exchange(a, j, j - h);
                j -= h;
            }
        }
    }
}
