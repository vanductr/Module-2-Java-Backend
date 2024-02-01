package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class TrungBinhMangSoNguyen {
    // Phương thức tạo mảng số nguyên với chiều dài mảng được người dùng nhập vào
    private static int[] getArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Phương thức tính tổng tất cả các số nguyên trong mảng
    private static double tinhTrungBinh(int[] arr, int count) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / count;
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số phần tử trong mảng: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                throw new Exception("Độ dài trong mảng phải là số nguyên dương.");
            }

            int[] arr = getArr(count);
            System.out.println("Mảng ban đầu:");
            System.out.println(Arrays.toString(arr));
            double giaTriTrungBinh = tinhTrungBinh(arr, count);
            System.out.println("Giá trị trung bình của Mảng là: " + giaTriTrungBinh);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
