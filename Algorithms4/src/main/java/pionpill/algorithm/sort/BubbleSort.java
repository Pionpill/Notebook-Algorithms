package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CheckUtils;
import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.DataUtils;
import pionpill.algorithm.utils.MathUtils;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(Comparable[] a) {
        for (int i = a.length -1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (MathUtils.isBig(a[j], a[j+1]))
                    CollectionUtils.exchange(a, j, j+1);
            }
        }
    }
}
