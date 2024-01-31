package rikkei.acedemy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Phương thức tạo 1 mảng số nguyên đã được sắp xếp
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr); // Sắp xếp từ nhỏ đến lớn
        return arr;
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Tạo 1 mảng bằng phương thức
        Integer[] integers = getArr();
        System.out.println("Đây là mảng ban đầu:");
        System.out.println(Arrays.toString(integers));

        System.out.println("Nhập giá trị bắt đầu và kết thúc để tìm các số ở giữa khoảng đó trong mảng.");
        System.out.print("Số bắt đầu: ");
        int startNumber = input.nextInt();
        System.out.print("Số kết thúc: ");
        int endNumber = input.nextInt();

        // Bước 3: Duyệt mảng để tìm vị trí của số lớn hơn gần nhất với min và nhỏ hơn gần nhất với max
        int startIndex = findClosestIndex(integers, startNumber, true);
        int endIndex = findClosestIndex(integers, endNumber, false);

        // Bước 4: In ra số lượng số tìm thấy và chi tiết về chúng
        int count = endIndex - startIndex + 1;
        System.out.println("Số lượng số nguyên trong khoảng [" + startNumber + ", " + endNumber + "]: " + count);

        if (count > 0) {
            System.out.print("Chi tiết: ");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.print(integers[i] + " ");
            }
        } else {
            System.out.println("Không có số nguyên nào trong khoảng.");
        }

        // Đóng scanner
        input.close();

    }

    // Phương thức tìm kiếm nhị phân
    // Phương thức tìm vị trí của số lớn hơn gần nhất với target hoặc nhỏ hơn gần nhất với target
    private static int findClosestIndex(Integer[] array, int target, boolean isMin) {
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Trả về vị trí nếu tìm thấy số chính xác
            } else if (array[mid] < target) {
                left = mid + 1;
                result = mid; // Cập nhật kết quả nếu tìm được số lớn hơn
            } else {
                right = mid - 1;
                result = mid; // Cập nhật kết quả nếu tìm được số nhỏ hơn
            }
        }

        // Trả về vị trí của số lớn hơn gần nhất hoặc nhỏ hơn gần nhất tùy thuộc vào biến isMin
        return isMin ? result + 1 : result;
    }

}
