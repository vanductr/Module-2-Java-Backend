package baitap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinElementExample {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(4);

        // Sử dụng phương thức Collections.min() để tìm phần tử nhỏ nhất
        int minValue = Collections.min(integerList);

        // Hiển thị phần tử nhỏ nhất
        System.out.println("Phần tử nhỏ nhất trong danh sách: " + minValue);
    }
}

