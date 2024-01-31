package rikkei.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[][] gerArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Xuống dòng sau khi in hết một dòng
        }
    }

    // Tạo 1 hàm có kiểu dữ liệu trả về là boolean
    public static boolean isNumber(int[][] integerArr, int number) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();
        boolean found = false;
        for (int i = 0; i < integerArr.length; i++) {
            for (int j = 0; j < integerArr[i].length; j++) {
                if (integerArr[i][j] == number) {
                    rowList.add(i + 1);
                    colList.add(j + 1);
                    found = true;
                }
            }
        }

        if (found) {
            // In ra vị trí của phần tử được tìm thấy
            System.out.println("Vị trí của phần tử " + number + " trong mảng là: ");
            for (int i = 0; i < rowList.size(); i++) {
                System.out.println("Dòng: " + rowList.get(i) + ", Cột: " + colList.get(i));
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int[][] integerArr = gerArr();
        System.out.println("Mảng ban đầu được tạo: ");
        printArr(integerArr);
        System.out.println();
        System.out.print("Hãy nhập 1 số nguyên bất kì để tìm xem số đó có hay không: ");
        int input = (new Scanner(System.in)).nextInt();
        boolean check = isNumber(integerArr, input);
        if (check) {
            System.out.println("Số " + input + " có trong mảng");
        } else {
            System.out.println("Số " + input + " không có trong mảng");
        }
    }
}
