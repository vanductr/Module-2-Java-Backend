package rikkei.academy;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        // Khai báo và khởi tạo HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 5);
        hashMap.put("Orange", 3);
        hashMap.put("Banana", 8);
        hashMap.put("Grapes", 2);

        // Tạo danh sách cặp key-value từ HashMap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sắp xếp danh sách theo giá trị tăng dần
        Collections.sort(entryList, Map.Entry.comparingByValue());

        // In ra kết quả
        System.out.println("HashMap sau khi sắp xếp:");

        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

