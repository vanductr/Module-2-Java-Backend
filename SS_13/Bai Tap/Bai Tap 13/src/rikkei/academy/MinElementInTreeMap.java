package rikkei.academy;

import java.util.TreeMap;

public class MinElementInTreeMap {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Bước 2: Đưa các phần tử vào TreeMap
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");
        treeMap.put(9, "Nine");
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");

        // Bước 3: Lấy giá trị của phần tử nhỏ nhất
        if (!treeMap.isEmpty()) {
            // Sử dụng phương thức firstEntry()
            var minEntry = treeMap.firstEntry();
            System.out.println("Phần tử nhỏ nhất trong TreeMap: Key = " + minEntry.getKey() + ", Value = " + minEntry.getValue());
        } else {
            System.out.println("TreeMap trống.");
        }
    }
}

