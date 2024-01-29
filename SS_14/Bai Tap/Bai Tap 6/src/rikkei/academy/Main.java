package rikkei.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 mảng số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(23);
        integerList.add(67);
        integerList.add(34);
        integerList.add(88);
        integerList.add(22);
        integerList.add(98);
        integerList.add(12);
        System.out.println("Mảng ban đầu:");
        System.out.println(integerList);
        System.out.println();
        System.out.print("Nhập số để lọc các số lớn hơn số này: ");
        int input = new Scanner(System.in).nextInt();

        System.out.println("Các số lớn hơn " + input + " là: ");
        integerList.stream().filter(number -> number > input).forEach(System.out::println);
    }
}
