package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple Meo Meo");
        words.add("banana Wine");
        words.add("VodKa Russia");
        words.add("all");

        System.out.println("Các từ bắt đầu bằng 'a' và có độ dài 3 ký tự:");
        words.stream().filter(word -> word.startsWith("a") && word.length() == 3).forEach(System.out::println);
    }
}
