package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CheckUtils;
import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.DataUtils;
import pionpill.algorithm.utils.MathUtils;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (MathUtils.isBig(a[min], a[j]))
                    min = j;
            }
            CollectionUtils.exchange(a, i, min);
        }
    }
}
