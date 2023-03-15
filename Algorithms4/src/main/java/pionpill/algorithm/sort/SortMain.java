package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CheckUtils;
import pionpill.algorithm.utils.DataUtils;

import java.sql.Time;
import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Integer[] data = DataUtils.generateDefaultRandomIntArray(100000);
//        System.out.println("原始数据: " + Arrays.toString(data));
        long startTime = System.currentTimeMillis();
        HeapSort.heapSort(data);
        long endTime = System.currentTimeMillis();
//        System.out.println("排序后数据: " + Arrays.toString(data));
        System.out.println(CheckUtils.isSorted(data) ? "排序成功" : "排序失败");
        System.out.println("排序耗时: " + (endTime - startTime) + "ms");
    }
}
