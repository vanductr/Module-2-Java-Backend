package bai_tap_9;

public class Baitap9_Cach2 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 7, 1, 9};

        // Bước 1: Tìm phần tử lớn nhất
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Bước 2: Tìm phần tử lớn thứ hai
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Phần tử lớn thứ hai là: " + secondLargest);
    }
}
