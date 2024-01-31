package baitap5;

public class ConcatenateStrings {
    public static String concatenateStrings(String str1, String str2) {
        // Sử dụng phương thức concat() để nối hai chuỗi
        String result = str1.concat(str2);

        return result;
    }

    public static void main(String[] args) {
        // Hai chuỗi cần nối
        String firstString = "Hello, ";
        String secondString = "World!";

        // Gọi phương thức để nối chuỗi
        String concatenatedString = concatenateStrings(firstString, secondString);

        // In ra kết quả
        System.out.println("Chuỗi sau khi nối: " + concatenatedString);
    }
}

