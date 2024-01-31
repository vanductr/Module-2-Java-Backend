package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 Danh sách chuỗi
        List<String> stringList = new ArrayList<>();
        stringList.add("Bảo");
        stringList.add("Dương");
        stringList.add("An");
        stringList.add("Yến");
        stringList.add("Hùng");
        stringList.add("Sơn");
        stringList.add("Quang");
        System.out.println("Danh sách ban đầu:");
        System.out.println(stringList+ "\n");

        List<String> sortedList = stringList.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println("Danh sách sau khi được sắp xếp:");
        System.out.println(sortedList);
    }
}
