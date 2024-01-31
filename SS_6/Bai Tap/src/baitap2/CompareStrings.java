package baitap2;

public class CompareStrings {
    public static void main(String[] args) {
        // Khai báo các biến kiểu String
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        String str3 = "Java Programming";

        // So sánh 2 chuỗi sử dụng phương thức equals() và đưa ra thông báo
        if (str1.equals(str2)) {
            System.out.println("Chuỗi str1 và str2 giống nhau.");
        } else {
            System.out.println("Chuỗi str1 và str2 không giống nhau.");
        }

        if (str1.equals(str3)) {
            System.out.println("Chuỗi str1 và str3 giống nhau.");
        } else {
            System.out.println("Chuỗi str1 và str3 không giống nhau.");
        }
    }
}
