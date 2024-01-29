package rikkei.academy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    // Phương thức tạo 1 mảng số nguyên đã được sắp xếp
    private static Integer[] gerArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] integers = gerArr();
        System.out.println("Mảng được tạo ngẫu nhiên: ");
        System.out.println(Arrays.toString(integers));

        System.out.print("Nhập 1 số nguyên để tìm vị trí của nó trong mảng: ");
        int input = (new Scanner(System.in)).nextInt();

        // Thuật toán tìm kiếm nhị phân để tìm vị trí của nó trong mảng

        int left = 0;
        int right = integers.length;
        while (right > left) {
            int mid = (left + right) / 2;

            if (integers[mid] == input) {
                System.out.println("Vị trí của " + input + " là: " + mid);
            } else if (input > integers[mid]) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
    }
}
