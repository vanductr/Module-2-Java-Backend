package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 danh sách số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(16);
        integerList.add(33);
        integerList.add(47);
        integerList.add(54);
        integerList.add(97);

        // Lọc các số nguyên
        System.out.println("Các số chẵn trong danh sách là:");
        integerList.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
    }
}
