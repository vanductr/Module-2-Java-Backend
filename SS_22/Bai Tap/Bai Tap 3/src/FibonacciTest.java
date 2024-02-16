import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FibonacciTest {

    @Test
    @DisplayName("Kiểm tra số 1")
    void getFibonacci1() {
        int number = 1;
        int ketQua = 1;

        int result = Fibonacci.getFibonacci(number);
        assertEquals(ketQua, result);
    }
}