package rikkei.academy;

import java.util.Stack;

public class DecimalToBinaryConverter {
    // Chuyển đổi từ hệ thập phân sang hệ nhị phân sử dụng Stack
    public static String decimalToBinary(int decimal) {
        Stack<Integer> binaryStack = new Stack<>();

        // Chuyển đổi số từ hệ thập phân sang nhị phân
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryStack.push(remainder);
            decimal /= 2;
        }

        // Đọc từ Stack và nối kết quả để tạo thành chuỗi
        StringBuilder binaryResult = new StringBuilder();
        while (!binaryStack.isEmpty()) {
            binaryResult.append(binaryStack.pop());
        }

        return binaryResult.toString();
    }

    public static void main(String[] args) {
        // Chuyển đổi từ hệ thập phân sang hệ nhị phân
        int decimalNumber = 19;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println(decimalNumber + " (hệ thập phân) = " + binaryNumber + " (hệ nhị phân)");
    }
}
