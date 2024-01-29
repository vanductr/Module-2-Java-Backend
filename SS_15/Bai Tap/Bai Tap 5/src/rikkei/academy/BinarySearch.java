package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Nhập mảng từ bàn phím và sắp xếp
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Nhập các phần tử của mảng (sắp xếp tăng dần):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();

        // Thực hiện tìm kiếm nhị phân
        int result = binarySearch(array, target);

        // In ra kết quả
        if (result != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }

    // Hàm tìm kiếm nhị phân
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Nếu giá trị ở giữa mảng bằng giá trị cần tìm, trả về vị trí
            if (array[mid] == target) {
                return mid;
            }

            // Nếu giá trị ở giữa mảng lớn hơn giá trị cần tìm, thực hiện tìm kiếm bên trái
            if (array[mid] > target) {
                right = mid - 1;
            }

            // Nếu giá trị ở giữa mảng nhỏ hơn giá trị cần tìm, thực hiện tìm kiếm bên phải
            else {
                left = mid + 1;
            }
        }

        // Trả về -1 nếu giá trị không được tìm thấy trong mảng
        return -1;
    }
}

