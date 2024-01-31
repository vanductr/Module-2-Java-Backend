package rikkei.academy;

import java.util.Arrays;

public class SmallestInteger {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        System.out.println("Mảng số nguyên ban đầu là:");
        int[] arr = gerArrInteger();
        System.out.println(Arrays.toString(arr));
        System.out.print("Số nhỏ nhất trong mảng là: ");
        int min = findSmallestInteger(arr);
        System.out.println(min);
    }

    // Phương thức tạo 1 mảng số nguyên bất kì
    public static int[] gerArrInteger() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Phương thức tìm số nhỏ nhất trong Mảng
    private static int findSmallestInteger(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
