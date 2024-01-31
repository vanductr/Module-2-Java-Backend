package rikkei.academy;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử.");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Mảng mà bạn đã nhập: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBắt đầu xử lý sắp xếp...");
        bubbleSortByStep(list);
    }

    // Phương thức bubbleSortByStep(): thực hiện và hiển thị các bước của thuật toán sắp xếp nổi bọt
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Đổi vị trí " + list[i] + " cho " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
            /* Mảng có thể được sắp xếp và không cần chuyển tiếp theo */
            if (needNextPass == false) {
                System.out.println("Mảng có thể được sắp xếp và không cần chuyển tiếp theo");
                break;
            }

            // Hiển thị danh sách sau khi sắp xếp
            System.out.println("Mảng đã được sắp xếp sau " + k + " lần.");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}













