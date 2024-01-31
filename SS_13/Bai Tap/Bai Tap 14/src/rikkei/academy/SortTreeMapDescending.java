package rikkei.academy;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class SortTreeMapDescending {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo TreeMap với Comparator.reverseOrder()
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        // Bước 2: Thêm các phần tử vào TreeMap
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");
        treeMap.put(9, "Nine");
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");

        // Bước 3: In ra các phần tử của TreeMap
        System.out.println("Các phần tử trong TreeMap theo thứ tự giảm dần:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
