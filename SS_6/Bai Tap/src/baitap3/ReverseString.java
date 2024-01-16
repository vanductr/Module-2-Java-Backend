package baitap3;

public class ReverseString {
    public static String reverseUsingStringBuffer(String input) {
        // Khởi tạo một đối tượng StringBuffer từ chuỗi đầu vào
        StringBuffer stringBuffer = new StringBuffer(input);

        // Sử dụng phương thức reverse() để đảo ngược chuỗi trong StringBuffer
        stringBuffer.reverse();

        // Chuyển đổi StringBuffer thành chuỗi và trả về kết quả
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        // Chuỗi ban đầu
        String originalString = "Hello, World!";

        // Gọi phương thức để đảo ngược chuỗi
        String reversedString = reverseUsingStringBuffer(originalString);

        // In ra kết quả
        System.out.println("Chuỗi ban đầu: " + originalString);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);
    }
}

