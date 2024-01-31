package baitap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDescendingExample {
    public static void main(String[] args) {
        // Tạo danh sách số nguyên
        List<Integer> integerList = createIntegerList();

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        System.out.println(integerList);

        // Sắp xếp danh sách theo thứ tự giảm dần
        sortListDescending(integerList);

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        System.out.println(integerList);
    }

    // Phương thức tạo danh sách số nguyên
    private static List<Integer> createIntegerList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);
        return integerList;
    }

    // Phương thức sắp xếp danh sách theo thứ tự giảm dần
    private static void sortListDescending(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
    }
}

