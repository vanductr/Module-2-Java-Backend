package baitap7;

public class AppendStringExample {
    public static void main(String[] args) {
        // Tạo đối tượng StringBuffer với nội dung ban đầu
        StringBuffer stringBuffer = new StringBuffer("Hello, ");

        // Chuỗi cần thêm vào cuối
        String appendString = "Java!";

        // Sử dụng phương thức append() để thêm chuỗi vào cuối
        stringBuffer.append(appendString);

        // In ra chuỗi kết quả
        System.out.println("Chuỗi sau khi thêm vào cuối: " + stringBuffer);
    }
}

