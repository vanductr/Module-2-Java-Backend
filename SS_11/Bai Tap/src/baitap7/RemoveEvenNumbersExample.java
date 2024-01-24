package baitap7;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNumbersExample {
    public static void main(String[] args) {
        // Bước 1: Tạo ArrayList chứa các số nguyên
        List<Integer> integerList = createIntegerList();

        // Bước 2: In danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        System.out.println(integerList);

        // Bước 3 và 4: Tạo danh sách mới không chứa số chẵn
        List<Integer> oddNumbersList = removeEvenNumbers(integerList);

        // Bước 5: In ra danh sách mới
        System.out.println("Danh sách sau khi xóa các số chẵn:");
        System.out.println(oddNumbersList);
    }

    // Bước 1: Tạo ArrayList chứa các số nguyên
    private static List<Integer> createIntegerList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(1);
        integerList.add(7);
        return integerList;
    }

    // Bước 3 và 4: Tạo danh sách mới không chứa số chẵn
    private static List<Integer> removeEvenNumbers(List<Integer> list) {
        List<Integer> oddNumbersList = new ArrayList<>();
        for (int number : list) {
            if (number % 2 != 0) {
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}

