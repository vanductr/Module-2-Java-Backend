package rikkei.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Phương thức làm mảng số ngẫu nhiên từ 1 đến 99
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integerArr = getArr();
        System.out.println("Mảng ban đầu:");
        System.out.println(Arrays.toString(integerArr));
        System.out.println("Nhập số bắt đầu và kết thúc để tìm các số trong khoảng đó.");
        System.out.print("Số bắt đầu: ");
        int startNumber = input.nextInt();
        System.out.print("Số kết thúc: ");
        int endNumber = input.nextInt();

        // Tạo 1 mảng để lưu các giá trị thoả mãn điều kiện
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] <= endNumber && startNumber <= integerArr[i]) {
                integerList.add(integerArr[i]);
            }
        }

        if (integerList.isEmpty()) {
            System.out.println("Không có các số từ " + startNumber + " đến " + endNumber + " trong mảng.");
        } else {
            System.out.println("Các số từ " + startNumber + " đến " + endNumber + " trong mảng là: ");
            System.out.println(integerList);
        }
    }
}
