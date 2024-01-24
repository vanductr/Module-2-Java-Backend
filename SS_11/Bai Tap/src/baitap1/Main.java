package baitap1; // Sử dụng phương thức Collections.max() để tìm ra phần tử lớn nhất

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 danh sách số nguyên ngẫu nhiên có tối đa 10 phần tử
        List<Integer> integerList = generateRandomList(10);

        // In danh sách số Nguyên
        System.out.println("Danh sách số nguyên:");
        System.out.println(integerList);

        // Tìm và in ra phần tử lớn nhất bằng phương thức Collections.max()
        int maxElement = Collections.max(integerList);
        System.out.println("Phần tử lớn nhất trong Mảng là: " + maxElement);
    }

    // Phương thức tạo danh sách số Nguyên ngẫu nhiên
    // Kiểu trả về: Phương thức này trả về 1 List<Integer> - nghĩa là 1 danh sách các số nguyên.
    // Tham số: Tham số duy nhất có kiểu dữ liệu là int - 1 số nguyên.
    private static List<Integer> generateRandomList(int size) {
        // Khai báo 1 biến randomList kiểu List<Integer>
        // List là 1 interface, nghĩa là nó là 1 định nghĩa chung cho 1 danh sách.
        // Integer: Là 1 kiểu dữ liệu nguyên thuỷ, nghĩa là nó là 1 số nguyên
        // new: là 1 từ khoá được sử dụng để tạo 1 đối tượng mới
        // ArrayList: là 1 lớp triển khai interface List.
        List<Integer> randomList = new ArrayList<>();

        // Khởi tạo 1 đối tượng với kiểu dữ liệu là Random.
        Random random = new Random();

        // Vòng lặp for để đưa các phần tử vào Mảng bằng phương thức add
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100)); // Giới hạn số ngẫu nhiên từ 0 đến 99
        }

        return randomList;
    }
}
