package rikkei.academy;

import java.util.*;

public class LongestSubstringSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String str = scanner.nextLine();

        Set<StringBuilder> arr = new HashSet<>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                result.append(str.charAt(i));
                arr.add(result);
            } else {
                char a = str.charAt(i + 1);
                char b =  str.charAt(i);
                if (Character.compare(a,b) > 0) {
                    result.append(str.charAt(i));
                } else {
                    result.append(str.charAt(i));
                    arr.add(result);
                    result = new StringBuilder();
                }
            }
        }
        System.out.println(arr);

        List<StringBuilder> newList = new ArrayList<>(arr);
        Optional<StringBuilder> max = newList.stream().max(Comparator.comparingInt(StringBuilder::length));

        if(max.isPresent()){
            System.out.println(max.get());
        }
    }
}





