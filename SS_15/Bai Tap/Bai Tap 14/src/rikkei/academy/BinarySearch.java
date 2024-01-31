package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        int[] arr = getArr();
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhập số để tìm vị trí của nó trong mảng: ");
        int input = (new Scanner(System.in)).nextInt();
        int index = findIndexBinary(arr, input);
        if (index != -1) {
            System.out.println("Vị trí của " + input + " trong mảng là: " + index);
        } else {
            System.out.println("Không tìm thấy " + input + " trong mảng.");
        }
    }

    // Phương thức tạo 1 mảng số nguyên bất kì
    private static int[] getArr() {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr); // Sắp xếp tăng dần
        return arr;
    }

    // Phương thức tìm vị trí index 1 số bất kì trong mảng
    private static int findIndexBinary(int[] arr, int number) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
