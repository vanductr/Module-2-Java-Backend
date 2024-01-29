package rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Phương thức tạo 1 mảng số nguyên
    public static int[] getArr() {
        int[] integerArr = new int[20];
        for (int i = 0; i < integerArr.length; i++) {
            integerArr[i] = (int) (Math.random() * 100);
        }
        return integerArr;
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Tạo 1 mảng từ phương thức
        int[] integerArr = getArr();

        // In mảng ra
        System.out.println("Đây là mảng đã tạo:");
        System.out.println(Arrays.toString(integerArr));
        System.out.println();
        System.out.print("Nhập 1 số để tìm vị trí của số đó trong mảng: ");
        int input = (new Scanner(System.in)).nextInt();
        boolean found = false;
        for (int i = 0; i < integerArr.length; i++) {
            if (integerArr[i] == input) {
                System.out.println("Vị trí xuất hiện đầu tiên của " + input + " trong mảng là " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy " + input + " trong mảng.");
        }
    }
}
