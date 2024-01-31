package thuc_hanh_chung;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo ra các hàm, phương thức để
        // 1. Thêm mới 1 giá trị vào mảng số nguyên và trả về mảng mới (2 tham số, mảng và giá trị cần thêm)
        // 2. Xoá 1 phần tử tại vị trí chỉ định trong mảng và trả về mảng sau khi đã xoá.

        // Mảng số nguyên ban đầu
        int[] originalArray = {1, 2, 3, 4, 5};

        // Giá trị mới cần thêm vào mảng
        int valueToAdd = 6;

        // Thêm giá trị mới vào mảng và nhận mảng mới
        int[] newArray = addValueToArray(originalArray, valueToAdd);

        // Hiển thị mảng mới
        System.out.println("Mảng mới sau khi thêm giá trị: " + Arrays.toString(newArray));

        // Vị trí cần xoá (ví dụ: xoá phần tử tại vị trí 2)
        int indexToRemove = 2;

        // Xoá phần tử tại vị trí chỉ định và nhận mảng mới
        int[] newArray2 = removeElementFromArray(originalArray, indexToRemove);
    }

    // Phương thức thêm giá trị mới vào mảng và trả về mảng mới
    public static int[] addValueToArray(int[] array, int value) {
        int length = array.length;

        // Tạo mảng mới với kích thước lớn hơn
        int[] newArray = Arrays.copyOf(array, length + 1);

        // Thêm giá trị mới vào cuối mảng
        newArray[length] = value;

        return newArray;
    }

    // Phương thức xoá phần tử tại vị trí chỉ định và trả về mảng mới
    public static int[] removeElementFromArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Vị trí không hợp lệ");
            return array;
        }

        // Tạo mảng mới với kích thước nhỏ hơn
        int[] newArray = new int[array.length - 1];

        // Sao chép các phần tử trước và sau vị trí cần xoá
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);

        return newArray;
    }
}
