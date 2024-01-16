package baitap11;

public class CaseConversionExample {
    public static void main(String[] args) {
        // Chuỗi cần chuyển đổi
        String inputString = "Hello, Java Programming!";

        // Chuyển đổi chữ hoa thành chữ thường
        String lowercaseString = inputString.toLowerCase();

        // Chuyển đổi chữ thường thành chữ hoa
        String uppercaseString = inputString.toUpperCase();

        // In ra kết quả
        System.out.println("Chuỗi gốc: " + inputString);
        System.out.println("Chuỗi chuyển đổi thành chữ thường: " + lowercaseString);
        System.out.println("Chuỗi chuyển đổi thành chữ hoa: " + uppercaseString);
    }
}

