package rikkei.academy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LargestNumber {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Tạo 1 mảng
        double[] doubles = getArr();

        // In mảng ban đầu
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(doubles));

        // Nhập vào 1 số để tìm vị trí của nó trong mảng
        System.out.print("Nhập số thực để tìm vị trí của nó: ");
        double number = (new Scanner(System.in)).nextDouble();

        // Tìm vị trí của nó trong mảng
        int index = findLargestNumber(doubles, number);

        if (index != -1) {
            System.out.println("Vị trí của " + number + " trong mảng là: " + index);
        } else {
            System.out.println("Không tìm thấy " + number + " trong mảng.");
        }
    }

    // Phương thức tạo 1 mảng số thực
    private static double[] getArr() {
        Random random = new Random();
        double[] arr = new double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    // Phương thức tìm số thực lớn nhất
    private static int findLargestNumber(double[] doubles, double input) {
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] == input) {
                return i;
            }
        }
        return -1;
    }
}
