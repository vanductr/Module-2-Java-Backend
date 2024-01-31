package bai_tap_3;

import java.util.Arrays;
import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        // Tạo 2 mảng số với kích thước cho trước
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1]; // Khởi tạo mảng array với chiều dài = size1

        // Lấy các phần tử của người dùng.
        System.out.println("Nhập các phần tử của mảng 1: ");
        nhapMang(array1, input);

        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2]; // Khởi tạo array2 với chiều dài = size2

        // Lấy các phần tử của người dùng.
        System.out.println("Nhập các phần tử của mảng 2: ");
        nhapMang(array2, input);

        // Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2.
        int[] array3 = new int[size1 + size2];

        // Gán các phần tử của mảng 1 vào mảng thứ 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // Gán các phần tử của mảng 2 vào mảng thứ 3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // Thử in ra xem ông array3 đã được thêm vào hay chưa.
        System.out.println("array3: " + Arrays.toString(array3));


    }

    // Phương thức để nhập các giá trị trong mảng.
    public static void nhapMang(int[] array, Scanner scanner){ //Nhận 2 tham số là 1 mảng và dữ liệu nhận được từ người dùng.
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
}
