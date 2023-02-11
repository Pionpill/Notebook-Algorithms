package pionpill.algorithm.sort;

import pionpill.algorithm.utils.CheckUtils;
import pionpill.algorithm.utils.DataUtils;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Integer[] data = DataUtils.generateDefaultRandomIntArray(100);
        System.out.println("原始数据: " + Arrays.toString(data));
        ShellSort.shellSort(data);
        System.out.println("排序后数据: " + Arrays.toString(data));
        System.out.println(CheckUtils.isSorted(data) ? "排序成功" : "排序失败");
    }
}
