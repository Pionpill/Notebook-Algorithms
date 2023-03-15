package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CollectionUtils;
import pionpill.algorithm.utils.MathUtils;

import java.util.Arrays;
import java.util.Collection;

public class QuickSort {
    public static void quickSort(Comparable[] arr) {
        quick3waySort(arr, 0, arr.length - 1);
    }

    private static void sort(Comparable[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid + 1, high);
    }

    private static int partition(Comparable[] arr, int low, int high) {
        Comparable v = arr[low];
        int p1 = low + 1;
        int p2 = high;
        while (true) {
            while (MathUtils.isLess(arr[p1], v)) {
                if (p1 == high)
                    break;
                p1++;
            }
            while (MathUtils.isBig(arr[p2], v)) {
                p2--;
            }
            if (p1 >= p2) break;
            CollectionUtils.exchange(arr, p1, p2);
        }
        CollectionUtils.exchange(arr, low, p2);
        return p2;
    }

    public static void quick3waySort(Comparable[] arr, int low, int high) {
        if (high <= low)
            return;
        int p1 = low, p2 = low + 1, p3 = high;
        Comparable v = arr[low];
        while (p2 <= p3) {
            int cmp = arr[p2].compareTo(v);
            if (cmp < 0)
                CollectionUtils.exchange(arr, p1++, p2++);
            else if (cmp > 0)
                CollectionUtils.exchange(arr, p2, p3--);
            else
                p2++;
        }
        quick3waySort(arr, low, p1 - 1);
        quick3waySort(arr, p3 + 1, high);
    }
}
