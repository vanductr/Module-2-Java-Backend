package rikkei.academy;

import java.util.Arrays;
import java.util.TreeMap;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng các số nguyên
        int[] array = {12, 5, 17, 8, 21, 4, 20, 23};

        // Bước 2: Khai báo TreeMap để lưu trữ các phần tử
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 3: Đưa các phần tử của mảng vào TreeMap
        for (int num : array) {
            treeMap.put(num, 0);
        }

        // Bước 4: Lấy giá trị của phần tử lớn nhất trong TreeMap
        int largestElement = treeMap.lastKey();

        // Bước 5: Xóa phần tử lớn nhất khỏi TreeMap
        treeMap.remove(largestElement);

        // Bước 6: Lấy giá trị của phần tử lớn thứ 2 trong mảng ban đầu
        int secondLargestElement = treeMap.lastKey();

        // In kết quả
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        System.out.println("Phần tử lớn thứ 2 trong mảng: " + secondLargestElement);
    }
}


