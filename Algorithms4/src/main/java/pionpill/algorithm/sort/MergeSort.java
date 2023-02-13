package pionpill.algorithm.sort;

import pionpill.algorithm.utils.MathUtils;

public class MergeSort {
    private static Comparable[] temp;

    private static void merge(Comparable[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        System.arraycopy(arr, 0, temp, 0, arr.length);
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) arr[k] = temp[j++];
            else if (j > high) arr[k] = temp[i++];
            else if (MathUtils.isLess(temp[i], temp[j]))
                arr[k] = temp[i++];
            else
                arr[k] = temp[j++];
        }
    }

    public static void mergeSort(Comparable[] arr) {
        mergeSort(arr, false);
    }

    public static void mergeSort(Comparable[] arr,boolean recursive) {
        temp = new Comparable[arr.length];
        if (recursive)
            recursiveSort(arr,0, arr.length -1);
        else
            iterateSort(arr);
    }

    private static void recursiveSort(Comparable[] a, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        recursiveSort(a, low, mid);
        recursiveSort(a, mid + 1, high);
        merge(a, low, high);
    }

    private static void iterateSort(Comparable[] a) {
        // 子数组大小, 两个子数组加起来不超过原数组大小
        for (int size = 1; size < a.length; size *= 2) {
            for (int low = 0; low < a.length; low += 2 * size) {
                iterateMerge(a, low, low + size - 1, Math.min(a.length - 1, low + 2 * size - 1));
            }
        }
    }

    private static void iterateMerge(Comparable[] arr, int low, int mid, int high) {
        System.arraycopy(arr, 0, temp, 0, arr.length);
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) arr[k] = temp[j++];
            else if (j > high) arr[k] = temp[i++];
            else if (MathUtils.isLess(temp[i], temp[j]))
                arr[k] = temp[i++];
            else
                arr[k] = temp[j++];
        }
    }
}
