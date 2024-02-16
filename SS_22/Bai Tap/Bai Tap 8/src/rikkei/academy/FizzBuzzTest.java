package rikkei.academy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class FizzBuzzTest {
    @Test
    @DisplayName("3")
    void testFizzBuzz3() {
        int number = 3;
        String ketQua = "Fizz";

        String result = FizzBuzz.testFizzBuzz(number);

        assertEquals(ketQua, result);
    }

    @Test
    @DisplayName("5")
    void testFizzBuzz5() {
        int number = 5;
        String ketQua = "Buzz";

        String result = FizzBuzz.testFizzBuzz(number);

        assertEquals(ketQua, result);
    }

    @Test
    @DisplayName("15")
    void testFizzBuzz15() {
        int number = 15;
        String ketQua = "FizzBuzz";

        String result = FizzBuzz.testFizzBuzz(number);

        assertEquals(ketQua, result);
    }

    @Test
    @DisplayName("17")
    void testFizzBuzz17() {
        int number = 17;
        String ketQua = "17";

        String result = FizzBuzz.testFizzBuzz(number);

        assertEquals(ketQua, result);
    }
}