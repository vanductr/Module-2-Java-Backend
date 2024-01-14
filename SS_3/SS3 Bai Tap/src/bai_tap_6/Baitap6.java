package bai_tap_6;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        // Bước 1: Nhập mảng hai chiều từ người dùng
        double[][] array = nhapMaTran();

        // Bước 2: Hiển thị mảng đã nhập
        System.out.println("Mảng đã nhập:");
        hienThiMaTran(array);

        // Bước 3: Nhập số cột muốn tính tổng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cột muốn tính tổng (tính từ 0): ");
        int columnIndex = scanner.nextInt();

        // Bước 4: Tính tổng của cột
        double tongCot = tinhTongCot(array, columnIndex);

        // Bước 5: Hiển thị kết quả
        System.out.println("Tổng của cột " + columnIndex + " là: " + tongCot);
    }

    // Phương thức nhập giá trị cho mảng từ người dùng
    public static double[][] nhapMaTran() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Nhập giá trị cho từng phần tử trong mảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử thứ [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    // Phương thức hiển thị mảng
    public static void hienThiMaTran(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Phương thức tính tổng của một cột trong mảng
    public static double tinhTongCot(double[][] matrix, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }

        return sum;
    }
}

