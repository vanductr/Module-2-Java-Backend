package rikkei.academy;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {};
        int[] arr = getArr();

        try {
            // throw: dùng để ném ra 1 ngoại lệ. Khi 1 ngoại lệ được ném
            // nó sẽ làm gián đoạn luồng thực thi bình thường của chương trình
            // và chuyển sang trình sử lí ngoại lệ phù hợp
            checkArrayNotEmpty(arr);
            int maxElement = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > maxElement) {
                    maxElement = arr[i];
                }
            }
            System.out.println("Mảng ban đầu: ");
            System.out.println(Arrays.toString(arr));
            System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
        } catch (ArrayEmptyException e) {
            System.out.println(e.getMessage());
        }

    }

    // Phương thức kiểm tra xem mảng có rỗng hay không
    private static void checkArrayNotEmpty(int[] array) throws ArrayEmptyException {
        if (array.length == 0) {
            throw new ArrayEmptyException("Mảng rỗng, không có phần tử.");
        }
    }

    // Phương thức tạo mảng số nguyên ngẫu nhiên gồm 20 phần tử
    private static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}

// Tạo class ArrayEmptyException được kế thừa từ class Exception
class ArrayEmptyException extends Exception {
    public ArrayEmptyException(String message) {
        super(message);
    }
}
