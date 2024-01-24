package baitap2;

import java.util.ArrayList;
import java.util.List;

public class ReverseListExample {
    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        // Tạo danh sách số Nguyên
        List<Integer> integerList = createIntegerList();

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        System.out.println(integerList);

        // Đảo ngược danh sách
        reverseList(integerList);

        // In ra danh sách khi đã đảo ngược
        System.out.println("Danh sách sau khi đã đảo ngược:");
        System.out.println(integerList);
    }

    // Phương thức tạo danh sách số nguyên
    private static List<Integer> createIntegerList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        return integerList;
    }

    // Phương thức đảo ngược danh sách mà không sử dụng hàm đảo ngược có sẵn trong List
    private static void reverseList(List<Integer> list) {
        int size = list.size(); // Khai báo biến size = độ dài của Mảng
        for (int i = 0; i < size / 2; i++) {
            int temp = list.get(i); // temp: Tạm thời
            list.set(i, list.get(size - i -1));
            list.set(size - i -1, temp);
        }
    }
}
