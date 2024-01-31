package baitap7;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNumbersExample { // Xoá số chẵn trong Danh sách
    public static void main(String[] args) {
        // Bước 1: Tạo 1 List số Nguyên
        List<Integer> integerList = new ArrayList<>();

        // Bước 2: Thêm phần tử vào List
        integerList.add(1);
        integerList.add(7);
        integerList.add(4);
        integerList.add(8);
        integerList.add(9);
        integerList.add(5);
        integerList.add(2);
        integerList.add(6);
        integerList.add(3);

        // Bước 3: Tạo List số Nguyên mới để lưu những số Nguyên không chia hết cho 2
        List<Integer> newIntegerList = new ArrayList<>();

        // Bước 4: Duyệt List đó và gán những số thoả mãn điều kiện vào list mới
        for (Integer integer : integerList) {
            if (integer % 2 != 0) {
                newIntegerList.add(integer);
            }
        }

        System.out.println("Danh sách số Nguyên ban đầu:");
        System.out.println(integerList);

        System.out.println();

        System.out.println("Danh sách sau khi đã được loại bỏ số chẵn:");
        System.out.println(newIntegerList);
    }
}

