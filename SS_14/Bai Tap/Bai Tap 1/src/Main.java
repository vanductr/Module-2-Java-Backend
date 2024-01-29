import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 Mảng với kiểu dữ liệu: List
        int[] integerList = {12, 5, 17, 8, 19, 4, 20};

        // Sử dụng Stream API
        int maxElement = Arrays.stream(integerList).max().orElseThrow();
        System.out.println("Số lớn nhất trong Mảng: " + maxElement);
    }
}
