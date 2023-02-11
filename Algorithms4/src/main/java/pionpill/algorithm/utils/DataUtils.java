package pionpill.algorithm.utils;

import java.util.Random;

public class DataUtils {
    public static Integer[] generateRandomIntArray(int length, int minValue, int maxValue) {
        Integer[] intArray = new Integer[length];
        Random r = new Random();
        for (int i =0; i< length; i++) {
            intArray[i] = r.nextInt(minValue, maxValue);
        }
        return intArray;
    }

    public static Integer[] generateDefaultRandomIntArray(int length) {
        return generateRandomIntArray(length, 0, 999);
    }
}
