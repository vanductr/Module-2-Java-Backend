package rikkei.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] integerArr = getArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(integerArr));
        System.out.println();

        int maxElement = integerArr[0];
        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] > maxElement) {
                maxElement = integerArr[i];
            }
        }

        System.out.println("Áp dụng tìm kiếm tuyến tính.");
        System.out.print("Số lớn nhất trong mảng là: ");
        System.out.println(maxElement);
    }
}
