package rikkei.academy;

import java.util.Arrays;

public class Main {
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] integerArr = getArr();
        System.out.println("Mảng ban đầu: ");
        System.out.println(Arrays.toString(integerArr));

        // Tìm kiếm tuyến tính để tìm ra phần tử nhỏ nhất trong mảng
        int minElement = integerArr[0];
        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] < minElement) {
                minElement = integerArr[i];
            }
        }

        System.out.print("Phần tử nhỏ nhất trong mảng là: ");
        System.out.println(minElement);
    }
}
