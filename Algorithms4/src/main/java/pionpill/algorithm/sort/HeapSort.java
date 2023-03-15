package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.MathUtils;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(Comparable[] arr) {
        int N = arr.length;
        for (int i = N / 2; i >= 0; i--)
            sink(arr, i, N);
        while (N > 1) {
            CollectionUtils.exchange(arr, 0, --N);
            sink(arr, 0, N);
        }
    }

    private static void sink(Comparable[] arr, int k, int N) {
        // 存在子节点
        while (2 * k + 1 <= N - 1) {
            int j = 2 * k + 1;
            if (j + 1 <= N - 1 && MathUtils.isBig(arr[j + 1], arr[j]))
                j++;
            if (MathUtils.isBig(arr[k], arr[j])) break;
            CollectionUtils.exchange(arr, k, j);
            k = j;
        }
    }
}
