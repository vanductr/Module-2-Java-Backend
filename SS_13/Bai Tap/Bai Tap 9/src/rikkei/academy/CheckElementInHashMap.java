package rikkei.academy;

import java.util.HashMap;

public class CheckElementInHashMap {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        // Bước 2: Kiểm tra xem phần tử có tồn tại trong HashMap hay không
        String keyToCheck = "Two";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Phần tử '" + keyToCheck + "' tồn tại trong HashMap.");
        } else {
            System.out.println("Phần tử '" + keyToCheck + "' không tồn tại trong HashMap.");
        }
    }
}

