package bai_tap_7;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        // Bước 1: Nhập ma trận vuông từ người dùng
        double[][] matrix = nhapMaTranVuông();

        // Bước 2: Hiển thị ma trận đã nhập
        System.out.println("Ma trận vuông đã nhập:");
        hienThiMaTran(matrix);

        // Bước 3: Tính tổng của đường chéo chính
        double tongDuongCheoChinh = tinhTongDuongCheoChinh(matrix);

        // Bước 4: Hiển thị kết quả
        System.out.println("Tổng của đường chéo chính là: " + tongDuongCheoChinh);
    }

    // Phương thức nhập ma trận vuông từ người dùng
    public static double[][] nhapMaTranVuông() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];

        System.out.println("Nhập giá trị cho từng phần tử trong ma trận vuông:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập giá trị cho phần tử thứ [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        return matrix;
    }

    // Phương thức hiển thị ma trận
    public static void hienThiMaTran(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Phương thức tính tổng của đường chéo chính
    public static double tinhTongDuongCheoChinh(double[][] matrix) {
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}

