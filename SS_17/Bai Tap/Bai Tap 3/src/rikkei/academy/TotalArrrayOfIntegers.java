package rikkei.academy;

import java.util.InputMismatchException;

public class TotalArrrayOfIntegers {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        try {
            int sum = calculateSum(array);
            System.out.println("Tổng của mảng là: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Xảy ra lỗi: " + e.getMessage());
        }
    }

    private static int calculateSum(int[] array) throws InputMismatchException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                sum += array[i];
            } catch (InputMismatchException e) {
                // Nếu phần tử không phải số nguyên, bỏ qua và hiển thị thông báo lỗi
                System.out.println("Xảy ra lỗi: Phần tử thứ " + (i + 1) + " không phải là số nguyên.");
            }
        }
        return sum;
    }
}
