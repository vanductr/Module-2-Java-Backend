package bai_tap_5;

import java.util.Scanner;
public class Baitap5 {
    public static void main(String[] args) {
        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        final int SIZE = 5; // Đặt kích thước của mảng, bạn có thể thay đổi theo nhu cầu
        int[] array = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        nhapMang(array);

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int minValue = array[0];

        // Bước 4: Duyệt mảng để tìm giá trị nhỏ nhất
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Hiển thị giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }

    // Phương thức nhập giá trị cho mảng từ bàn phím
    public static void nhapMang(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
}
