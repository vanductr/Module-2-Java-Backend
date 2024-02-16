package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {

    @Test
    void isPrime() {
        int number = 17;
        boolean ketQua = true;

        boolean result = PrimeNumber.isPrime(number);
        assertEquals(ketQua, result);
    }
}