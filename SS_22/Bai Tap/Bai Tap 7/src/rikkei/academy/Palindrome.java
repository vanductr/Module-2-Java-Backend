package rikkei.academy;

public class Palindrome {
    public static boolean isPalindrome(String str) {
//        if (str == null) {
//            throw new IllegalAccessException("The input string must not be null");
//        }

        String reversed = new StringBuffer(str).reverse().toString();

        return str.equals(reversed);
    }
}
