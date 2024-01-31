package rikkei.academy;

import java.util.Arrays;

public class InsertSort {
    // Phương thức tạo 1 mảng số nguyên ngẫu nhiên từ 1 đến 99 gồm 20 phần tử
    private static int[] getIntegerArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        int[] arr = getIntegerArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng sau khi đã được sắp xếp:");
        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    // Mô tả thuật toán sắp xếp chèn
    private static void insertSort(int[] arr) {
        System.out.println("Các bước sắp xếp chèn:");
        System.out.println("Sử dụng vòng lặp i với i chạy từ 1 đến vị trí cuối cùng của mảng");
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Gán key với giá trị của mảng ở vị trí thứ " + i);
            System.out.println("Mảng ở vị trí " + i + " là: " + arr[i]);
            int key = arr[i];

            System.out.println("Tạo giá trị của j = i - 1 : j = " + (i - 1) );
            int j = i - 1;

            System.out.println("Bắt đầu vòng lòng while với điều kiện j >= 0 && ");
            System.out.println("Mảng ở vị trí thứ j > key");
            while (j >= 0 && arr[j] > key) {
                System.out.println("Nếu thoả mãn điều kiện");
                System.out.println("Gán giá trị của mảng ở vị trí (j + 1) = (j)");
                arr[j + 1] = arr[j];
                System.out.println("Giảm giá trị của j đi 1");
                j--;
                System.out.println("Quay lại so sánh điều kiện của vònng lặp while");
            }
            System.out.println("Kết thúc vòng lặp while, gán giá trị của mảng ở vị trí (j + 1) = key");
            arr[j + 1] = key;
            System.out.println("------------------------------------------");
        }
    }
}
