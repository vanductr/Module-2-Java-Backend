package bai_tap_9;

public class Baitap9_Cach3 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 7, 1, 9};

        // Bước 1: Khai báo biến lưu phần tử lớn nhất và lớn thứ hai
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Bước 2: Duyệt mảng để tìm phần tử lớn nhất và lớn thứ hai
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai là: " + secondLargest);
    }
}
