package bai_tap_2;

import java.util.Arrays;
import java.util.Scanner;
public class Baitap2 {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N]; // Khai báo Mảng với chiều dài là N.

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập số cần chèn (X): ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí index cần chèn (0 - " + (N - 1) + "): ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra điều kiện index hợp lệ
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào mảng
            for (int i = N - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            // Bước 6: In ra mảng
            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + ": " + Arrays.toString(array));
        }
    }
}
