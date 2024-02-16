package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

//    @org.junit.jupiter.api.Test
//    void doSort() {
//        int[] arr = {1, 9, 5, 8, 3, 2, 4};
//        int[] ketQua = {1, 2, 3, 4, 5, 8, 9};
//
//        int[] result = BubbleSort.doSort(arr);
//        assertArrayEquals(ketQua, result);
//    }

    @Test
    void testDoSort() {
        // Arrange
        int[] arr = {5, 3, 8, 1, 9};
        int[] expected = {1, 3, 5, 8, 9};

        // Act
        BubbleSort.doSort(arr);

        // Assert
        assertArrayEquals(expected, arr);
    }
}