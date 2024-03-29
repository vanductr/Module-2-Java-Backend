package bai_tap_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số Nguyên gồm N phần tử cho trước.
        int[] myArray = {1, 4, 6, 2, 7, 8, 3, 0, 5, 9};

        // Bước 2: Nhập X là phần tử cần xoá.
        System.out.println("Bạn muốn xoá số mấy khỏi danh sách: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        // Bước 4: Thực hiện xoá phần tử x khỏi mảng.
        // Tạo 1 mảng mới có độ dài ngắn hơn mảng ban đầu
        int[] newArray = new int[myArray.length - 1];
        int newArrayIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != x) {
                newArray[newArrayIndex] = myArray[i];
                newArrayIndex++;
            }
        }
        myArray = newArray;

        // Bước 5: Kết thúc duyệt mảng, in mảng ra.
        System.out.println("Đây là mảng mới: " + Arrays.toString(myArray));
    }
}
