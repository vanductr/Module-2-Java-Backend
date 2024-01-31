package thuchanh6; // Số lượng sinh viên thi đỗ (điều kiện để đỗ là >= 5)

import java.util.Scanner;

public class Thuchanh6 {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên không được vượt quá 30!");
            }
        } while (size > 30); // Nếu size > 30, vòng lặp được chạy.

        // Nhập giá trị cho các phần tử của mảng.
        array = new int[size]; // Khởi tạo lại mảng array có chiều dài là size.
        int i = 0;
        while (i < array.length) {
            System.out.println("Hãy thêm điểm của sinh viên ở vị trí thứ " + (i + 1) + " : ");
            int inputValue = input.nextInt();
            array[i] = inputValue;
            i++;
        }

        // Sử dụng vòng for để in ra điểm của sinh viên vừa nhập
        // Và in ra số sinh viên đỗ

        int count = 0; // Số sinh viên đỗ.
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t"); // "\t": biểu thị dấu Tab. Tạo ra 1 khoảng trắng.
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }

        System.out.println();
        System.out.println("Số sinh viên đã đạt điểm đỗ là: " + count);
    }
}
