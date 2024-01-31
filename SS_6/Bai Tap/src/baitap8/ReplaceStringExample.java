package baitap8;

public class ReplaceStringExample {
    public static void main(String[] args) {
        // Tạo đối tượng StringBuffer với nội dung ban đầu
        StringBuffer stringBuffer = new StringBuffer("Hello, Java!");

        // Chuỗi cần thay thế
        String oldString = "Java";

        // Chuỗi mới thay thế
        String newString = "World";

        // Sử dụng phương thức replace() để thay thế chuỗi
        int startIndex = stringBuffer.indexOf(oldString);
        int endIndex = startIndex + oldString.length();

        stringBuffer.replace(startIndex, endIndex, newString);

        // In ra chuỗi kết quả
        System.out.println("Chuỗi sau khi thay thế: " + stringBuffer);
    }
}

