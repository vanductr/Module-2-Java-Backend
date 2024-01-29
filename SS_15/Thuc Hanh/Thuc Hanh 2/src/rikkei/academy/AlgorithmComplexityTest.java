package rikkei.academy;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi hoặc văn bản:");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            // Tìm vị trí tương ứng của kí tự trong bảng: ASCII
            int ascii = (int) inputString.charAt(i);

            // Tăng giá trị tần suất
            frequentChar[ascii] += 1;
        }

        // Tìm kí tự có tần số xuất hiện nhiều nhất
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }

        System.out.println("Chữ cái xuất hiện nhiều nhất là '" + character + "' với tần suất " + max + " lần");
    }
}
