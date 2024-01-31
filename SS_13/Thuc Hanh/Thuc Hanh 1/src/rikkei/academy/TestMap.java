package rikkei.academy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hùng", 30);
        hashMap.put("Huyền", 32);
        hashMap.put("Hoà", 31);
        hashMap.put("Hải", 34);
        System.out.println("Hiển thị Cặp Key-Value(entries) trong HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị các entries theo thứ tự tăng dần của Key:");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hoàng", 30);
        linkedHashMap.put("Hào", 21);
        linkedHashMap.put("Sơn", 31);
        linkedHashMap.put("Bảo", 25);
        System.out.println("\n Tuổi của Hoàng là " + linkedHashMap.get("Hoàng") + " tuổi.");
    }
}
