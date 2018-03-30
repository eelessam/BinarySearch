package com.eelessam.binary.search;

class BinarySearchTwo {

    private static final int VALUE_OUT_OF_BOUNDS = -1;

    private BinarySearchTwo() {
        throw new IllegalStateException("Utility class");
    }

    static int binarySearch(Integer value, Integer[] array) {

        if (array.length == 0) {
            return VALUE_OUT_OF_BOUNDS;
        }

        int minIndex = 0;
        int maxIndex = array.length - 1;

        while (true) {
            int midIndex = ((maxIndex - minIndex) / 2) + minIndex;
            int midValue = array[midIndex];

            if (midValue == value) {
                return midIndex;
            } else if ((maxIndex - minIndex) >= 1) {
                 if (midValue < value) {
                    minIndex = midIndex + 1;
                } else {
                    maxIndex = midIndex - 1;
                }
            } else {
                break;
            }
        }

        return VALUE_OUT_OF_BOUNDS;
    }
}
