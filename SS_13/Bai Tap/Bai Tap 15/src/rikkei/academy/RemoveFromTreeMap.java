package rikkei.academy;

import java.util.TreeMap;

public class RemoveFromTreeMap {
    public static void main(String[] args) {
        // Khởi tạo TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Thêm các phần tử vào TreeMap
        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(8, "Eight");
        treeMap.put(1, "One");
        treeMap.put(9, "Nine");
        treeMap.put(4, "Four");
        treeMap.put(3, "Three");

        // In ra các phần tử của TreeMap trước khi xóa
        System.out.println("Các phần tử trong TreeMap trước khi xóa:");
        for (var entry : treeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // Thực hiện xóa phần tử có key là 4
        int keyToRemove = 4;
        treeMap.remove(keyToRemove);

        // In ra các phần tử của TreeMap sau khi xóa
        System.out.println("\nCác phần tử trong TreeMap sau khi xóa key " + keyToRemove + ":");
        for (var entry : treeMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}

