package thuchanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khai báo biến size; int là kiểu dữ liệu của size
        // int là 1 trong các kiểu dữ liệu nguyên(interger), được sử dụng
        // để lưu trữ các giá trị số nguyên không có phần thập phân.
        int size;

        // Khai báo 1 mảng với kiểu dữ liệu là int, tên mảng là array.
        int[] array;

        // Lấy thông tin người dùng nhập vào
        Scanner scanner = new Scanner(System.in);

        // Vòng lặp do-while: để chắc chắn được lặp lại 1 lần trước khi kiểm tra điều kiện
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }
        } while (size > 20); // Nếu giá trị người dùng nhập vào vượt quá 20, thì vòng lặp sẽ không bao giờ dừng

        // Vòng lặp kết thúc, lấy được giá trị của size
        // Lấy size làm chiều dài cho mảng array. Cú pháp khai báo như dưới
        array = new int[size];

        // Khởi tạo i = 0
        int i = 0;

        // Vòng lặp while để lặp qua các vị trí của phần tử trong mảng
        // Các phần tử trong Mảng sẽ lần lượt được người dùng nhập vào
        while (i < array.length) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra chữ Element in array:
        System.out.printf("%-20s%s", "Element in array: ", "");

        // Dùng for để in ra: các phần tử trong mảng ban đầu.
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Vòng for này để đảo ngược các phần tử trong mảng.
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 - j] = temp;
        }

        // in ra chữ Reverse array
        System.out.printf("\n%-20%s", "Reverse array: ", "");

        // Vòng for này để in ra các phần tử trong mảng đã được đảo ngược lại.
        for (int j = 0;j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}












