package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void findMax() {
        int[] arr = {1, 3, 5, 7, 9};
        int ketQua = 9;

        int thuNghiem = Main.findMax(arr);
        assertEquals(ketQua, thuNghiem);
    }
}