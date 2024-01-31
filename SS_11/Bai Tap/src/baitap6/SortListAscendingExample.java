package baitap6;

import java.util.ArrayList;
import java.util.List;

public class SortListAscendingExample {
    public static void main(String[] args) {
        // Bước 1: Tạo danh sách số nguyên
        List<Integer> integerList = createIntegerList();

        // Bước 2: In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        System.out.println(integerList);

        // Bước 3: Sắp xếp danh sách theo thứ tự tăng dần bằng thuật toán sắp xếp chọn
        selectionSort(integerList);

        // Bước 4: In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần:");
        System.out.println(integerList);
    }

    // Bước 1: Tạo danh sách số nguyên
    private static List<Integer> createIntegerList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);
        return integerList;
    }

    // Bước 3: Thuật toán sắp xếp chọn
    private static void selectionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử tại minIndex và i
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}

