package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CheckUtils;
import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.DataUtils;
import pionpill.algorithm.utils.MathUtils;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            Comparable temp = a[i];
            int index = i-1;
            while (index >= 0 && MathUtils.isBig(a[index], temp)) {
                a[index+1] = a[index];
                index--;
            }
            a[index+1] = temp;
        }
    }
}
