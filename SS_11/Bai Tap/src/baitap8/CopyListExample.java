package baitap8;

import java.util.ArrayList;
import java.util.List;

public class CopyListExample {
    public static void main(String[] args) {
        // Tạo danh sách nguồn
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Phần tử 1");
        sourceList.add("Phần tử 2");
        sourceList.add("Phần tử 3");

        // Tạo danh sách đích
        List<String> destinationList = new ArrayList<>();

        // Sử dụng phương thức addAll() để sao chép tất cả các phần tử từ danh sách nguồn sang danh sách đích
        destinationList.addAll(sourceList);

        // Hiển thị danh sách đích sau khi sao chép
        System.out.println("Danh sách đích sau khi sao chép: " + destinationList);
    }
}

