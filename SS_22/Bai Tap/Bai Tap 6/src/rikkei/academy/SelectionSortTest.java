package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @org.junit.jupiter.api.Test
    void doSort() {
        int[] arr = {3, 2, 9, 1, 7, 4, 6, 5, 8};
        int[] ketQua = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        SelectionSort.doSort(arr);

        assertArrayEquals(arr, ketQua);
    }
}