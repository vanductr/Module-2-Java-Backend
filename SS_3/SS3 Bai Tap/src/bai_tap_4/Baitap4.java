package bai_tap_4;

import java.util.Scanner;
public class Baitap4 {
    public static void main(String[] args) {
        // Bước 1: Nhập kích thước của ma trận
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Bước 2: Khai báo và khởi tạo ma trận
        double[][] matrix = new double[rows][cols];

        // Bước 3: Nhập giá trị cho từng phần tử trong ma trận
        System.out.println("Nhập giá trị cho từng phần tử trong ma trận:");
        nhapMaTran(matrix, scanner);

        // Bước 4: Tìm phần tử lớn nhất và tọa độ của nó
        double[] result = timPhanTuLonNhat(matrix);
        int rowMax = (int) result[0];
        int colMax = (int) result[1];
        double maxValue = result[2];

        // Bước 5: Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxValue +
                " tại vị trí (" + rowMax + ", " + colMax + ").");
    }

    // Phương thức nhập giá trị cho ma trận
    public static void nhapMaTran(double[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) { // i: Lặp qua các hàng của Ma trận
            for (int j = 0; j < matrix[0].length; j++) { // j: Lặp qua các cột của Ma trận
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    // Phương thức tìm phần tử lớn nhất và trả về tọa độ của nó
    public static double[] timPhanTuLonNhat(double[][] matrix) {
        double[] result = new double[3];
        double maxValue = matrix[0][0];
        int rowMax = 0;
        int colMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    rowMax = i;
                    colMax = j;
                }
            }
        }

        result[0] = rowMax;
        result[1] = colMax;
        result[2] = maxValue;

        return result;
    }
}





















