package com.eelessam.binary.search;

import org.junit.Test;

import static com.eelessam.binary.search.BinarySearchTwo.binarySearch;
import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTwoTest {

    @Test
    public void binarySearchTest() {
        assertThat(binarySearch(3, new Integer[]{})).isEqualTo(-1);
        assertThat(binarySearch(3, new Integer[]{1})).isEqualTo(-1);
        assertThat(binarySearch(1, new Integer[]{1})).isEqualTo(0);

        assertThat(binarySearch(1, new Integer[]{1, 3, 5})).isEqualTo(0);
        assertThat(binarySearch(3, new Integer[]{1, 3, 5})).isEqualTo(1);
        assertThat(binarySearch(0, new Integer[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binarySearch(5, new Integer[]{1, 3, 5})).isEqualTo(2);
        assertThat(binarySearch(2, new Integer[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binarySearch(4, new Integer[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binarySearch(6, new Integer[]{1, 3, 5})).isEqualTo(-1);

        assertThat(binarySearch(1, new Integer[]{1, 3, 5, 7})).isEqualTo(0);
        assertThat(binarySearch(3, new Integer[]{1, 3, 5, 7})).isEqualTo(1);
        assertThat(binarySearch(5, new Integer[]{1, 3, 5, 7})).isEqualTo(2);
        assertThat(binarySearch(7, new Integer[]{1, 3, 5, 7})).isEqualTo(3);
        assertThat(binarySearch(0, new Integer[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binarySearch(2, new Integer[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binarySearch(4, new Integer[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binarySearch(6, new Integer[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binarySearch(8, new Integer[]{1, 3, 5, 7})).isEqualTo(-1);
    }
}