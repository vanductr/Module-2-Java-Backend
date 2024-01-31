package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Các số chẵn từ danh sách:");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }
}
