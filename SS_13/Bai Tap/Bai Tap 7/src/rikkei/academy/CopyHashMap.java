package rikkei.academy;

import java.util.HashMap;

public class CopyHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap gốc
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");

        // In HashMap gốc
        System.out.println("HashMap gốc: " + originalMap);

        // Bước 2: Khai báo một HashMap mới và sao chép tất cả các phần tử từ HashMap gốc
        HashMap<Integer, String> copiedMap = new HashMap<>();
        copiedMap.putAll(originalMap);

        // Bước 3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
        System.out.println("HashMap mới (sao chép): " + copiedMap);
    }
}

