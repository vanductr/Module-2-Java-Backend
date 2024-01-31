package rikkei.academy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinaryRealNumber {
    public static void main(String[] args) {
        // Bước 1: Tạo mảng ngẫu nhiên
        double[] randomArray = createRandomArray(20);

        // Bước 2: In mảng trước khi sắp xếp
        System.out.println("Mảng trước khi sắp xếp: ");
        printArray(randomArray);

        // Bước 3: Sắp xếp mảng
        Arrays.sort(randomArray);

        // Bước 4: In mảng sau khi sắp xếp
        System.out.println("\nMảng sau khi sắp xếp: ");
        printArray(randomArray);
        System.out.println();

        // Tìm index của phần tử trong mảng số thực bằng phương pháp nhị phân
        System.out.print("Nhập số cần tìm trong mảng: ");
        double inputNumber = (new Scanner(System.in)).nextDouble();
        int index = findIndexBinary(randomArray, inputNumber);
        if(index != -1) {
            System.out.println("Vị trí của " + inputNumber + " trong mảng là: " + index);
        } else {
            System.out.println("Không tìm thấy " + inputNumber + " trong mảng.");
        }
    }

    // Thuật toán tìm kiếm nhị phân
    private static int findIndexBinary(double[] doubles, double realNumber) {
        int left = 0;
        int right = doubles.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (doubles[mid] == realNumber) {
                return mid;
            } else if (doubles[mid] < realNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static double[] createRandomArray(int size) {
        double[] arr = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }

        return arr;
    }

    private static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
    }
}
