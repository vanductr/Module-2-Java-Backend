package rikkei.academy;

import java.util.Arrays;
import java.util.TreeMap;

public class SortArrayToTreeMap {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng nguyên
        int[] array = {5, 2, 8, 1, 9, 4, 3};

        // Bước 2: Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(array);

        // Bước 3: Khởi tạo TreeMap để lưu trữ các phần tử
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 4: Đưa các phần tử của mảng vào TreeMap
        for (int element : array) {
            treeMap.put(element, 0);
        }

        // Bước 5: In ra kết quả
        System.out.println("Các phần tử trong TreeMap (sắp xếp theo thứ tự tăng dần của khóa):");
        for (int key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
}

