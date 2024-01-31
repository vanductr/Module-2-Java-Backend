package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 danh sách số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(18);
        integerList.add(27);
        integerList.add(23);
        integerList.add(19);
        integerList.add(11);
        integerList.add(90);
        System.out.println(integerList);

        int sum = integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.print("Tổng của các số trong Danh sách trên là: ");
        System.out.println(sum);
    }
}
