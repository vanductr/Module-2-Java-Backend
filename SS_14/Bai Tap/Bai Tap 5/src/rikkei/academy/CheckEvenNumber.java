package rikkei.academy;

import java.util.Arrays;
import java.util.List;

public class CheckEvenNumber {
    public static void main(String[] args) {
        // Bước 1: Tạo một danh sách số nguyên
        List<Integer> numberList = Arrays.asList(1, 3, 5, 7, 8, 9, 11);

        // Bước 2: Kiểm tra xem danh sách có chứa số chẵn hay không
        boolean containsEvenNumber = numberList.stream()
                .anyMatch(number -> number % 2 == 0);

        if (containsEvenNumber) {
            System.out.println("Danh sách chứa số chẵn.");
        } else {
            System.out.println("Danh sách không chứa số chẵn.");
        }
    }
}

