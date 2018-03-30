package com.eelessam.binarySearch;


import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchOne {

    private static final Integer VALUE_OUT_OF_BOUNDS = -1;

    public static Integer binarySearch(Integer value, Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        if (list.isEmpty()) {
            return VALUE_OUT_OF_BOUNDS;
        }

        return binarySearch(0, list.size() - 1, value, list);

    }

    private static Integer binarySearch(int minIndex, int maxIndex, int value, ArrayList<Integer> list) {
        Integer minValue = list.get(minIndex);
        Integer maxValue = list.get(maxIndex);

        if (isValueOutOfRange(value, minValue, maxValue)) {
            return VALUE_OUT_OF_BOUNDS;
        }

        int indexDiff = (int) Math.ceil((double)(maxIndex - minIndex) / 2);
        int middleIndex = indexDiff + minIndex;
        int middleValue = list.get(middleIndex);


        if(middleValue == value) {
            return middleIndex;
        }

        if (indexDiff == 1) {
            return handleIndexDiffOfOne(minIndex, maxIndex, value, list);
        }

        if (middleValue > value) {
            return binarySearch(minIndex, middleIndex, value, list);
        } else {
            return binarySearch(middleIndex, maxIndex, value, list);
        }

    }

    private static boolean isValueOutOfRange(Integer value, Integer minValue, Integer maxValue) {
        return value < minValue || value > maxValue;
    }

    private static Integer handleIndexDiffOfOne(int minIndex, int maxIndex, int value, ArrayList<Integer> list) {
        if (list.get(minIndex) == value) {
            return minIndex;
        } else if (list.get(maxIndex) == value) {
            return maxIndex;
        } else {
            return VALUE_OUT_OF_BOUNDS;
        }
    }

}
