package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Phương thức tạo 1 mảng số nguyên bất kì có 20 phần tử đã được sắp xếp tăng dần
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    // Phương thức Sắp xếp nhị phân
    private static int binarySearch(int[] arr, int value) throws ElementNotFoundException {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        throw new ElementNotFoundException("Phần tử không được tìm thấy trong mảng.");
    }
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Tạo 1 mảng
        int[] arr = getArr();
        System.out.println("Đây là mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        int input;
        try {
            System.out.print("Nhập số để tìm vị trí của nó trong mảng: ");
            input = (new Scanner(System.in)).nextInt();
            int index = binarySearch(arr, input);

            if (index != -1) {
                System.out.println("Phần tử " + input + " được tìm thấy ở vị trí " + index);
            } else {
                throw new ElementNotFoundException("Phần tử " + input + " không được tìm thấy trong mảng.");
            }
        } catch (ElementNotFoundException e) {
            System.out.println("Xảy ra lỗi: " + e.getMessage());
        }
    }
}

// Tạo 1 class kế thừa từ lớp Exception
class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}