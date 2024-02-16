package rikkei.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    @DisplayName("Kiểm tra chuỗi 'Rikkei academy'")
    void isPalindrome() {
        String string = "Rikkei Academy";
        boolean check = false;

        boolean result = Palindrome.isPalindrome(string);

        assertEquals(check, result);
    }

    @Test
    @DisplayName("Kiểm tra chuỗi 'abcba'")
    void isPalindrome2() {
        String s = "abcba";
        boolean check = true;

        boolean result = Palindrome.isPalindrome(s);

        assertEquals(check, result);
    }
}