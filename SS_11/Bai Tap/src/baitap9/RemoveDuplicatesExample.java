package baitap9;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        // Tạo danh sách số nguyên với các phần tử trùng lặp
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);

        // Gọi phương thức xóa phần tử trùng lặp
        removeDuplicates(integerList);

        // Hiển thị danh sách sau khi xóa phần tử trùng lặp
        System.out.println("Danh sách sau khi xóa phần tử trùng lặp: " + integerList);
    }

    // Phương thức để xóa các phần tử trùng lặp từ danh sách
    private static void removeDuplicates(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer element : list) {
            // Nếu phần tử chưa tồn tại trong uniqueList, thêm vào danh sách duy nhất
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Xóa toàn bộ phần tử từ danh sách gốc và thêm lại từ danh sách duy nhất
        list.clear();
        list.addAll(uniqueList);
    }
}

