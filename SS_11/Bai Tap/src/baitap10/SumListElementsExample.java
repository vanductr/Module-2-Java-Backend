package baitap10;

import java.util.ArrayList;
import java.util.List;

public class SumListElementsExample {
    public static void main(String[] args) {
        // Tạo danh sách các số nguyên
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Tính tổng các phần tử trong danh sách sử dụng phương thức forEach()
        int sum = 0;
        for (Integer element : integerList) {
            sum += element;
        }

        // Hiển thị tổng
        System.out.println("Tổng của các phần tử trong danh sách: " + sum);
    }
}

