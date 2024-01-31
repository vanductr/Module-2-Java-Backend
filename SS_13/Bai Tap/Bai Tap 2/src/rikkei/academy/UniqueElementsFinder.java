package rikkei.academy;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementsFinder { // Tìm phần tử duy nhất trong mảng.
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 3, 10};

        // Khai báo HashMap để lưu trữ số lần xuất hiện của mỗi phần tử
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Bước 2: Duyệt từng phần tử trong mảng và lưu trữ vào HashMap
        for (int element : array) {
            if (elementCountMap.containsKey(element)) {
                // Nếu phần tử đã có trong HashMap, tăng giá trị tương ứng lên 1
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                // Nếu phần tử chưa có trong HashMap, thêm vào với giá trị là 1
                elementCountMap.put(element, 1);
            }
        }

        // Bước 3: Duyệt qua các phần tử trong HashMap để lấy các phần tử duy nhất
        // Bước 4: In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất trong mảng:");
        // Map.Entry<Integer, Integer>: Kiểu dữ liệu
        // entrySet(): trả về 1 tập hợp các đối tượng Map.Entry
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

