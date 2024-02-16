package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void soSort() {
        int[] arr = {6, 3, 8, 2, 9, 1, 7, 4, 5};
        int[] ketQua = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        InsertionSort.soSort(arr);

        assertArrayEquals(arr, ketQua);
    }
}