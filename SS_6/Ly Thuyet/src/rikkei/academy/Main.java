package rikkei.academy;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        // Các phương thức làm việc với chuỗi
        System.out.println("Độ dài chuỗi là: " + str.length());

        // Lấy ra kí tự tại vị trí index
        System.out.println("Ký tự ở vị trí index = 3 là " + str.charAt(3));

        // Nối chuỗi
        String newStr = str.concat(" world");
        System.out.println("str :" + str);
        System.out.println("newStr :" + newStr);

        // So sánh
        System.out.println("So sánh str vs newStr => " + str.equals(newStr));
        String string = "HELLO";
        System.out.println("Không phân biệt chữ Hoa - chữ thườn: " + str.equalsIgnoreCase(string));

        // Hiệu của 2 chuỗi
        System.out.println("Hiệu 2 chuỗi: " + str.compareTo(string)); // hello - HELLO

        // Tìm kiếm tương đối
        System.out.println("Kiểm tra có phải chuỗi con hay không: " + newStr.contains("world"));

        // Cắt chuỗi theo vị trí
        System.out.println(newStr.substring(0, 5));

        // ================ StringBuilder(bất đồng bộ) và StringBuffer(đồng bộ, bộ nhớ đệm) ==========================
        StringBuilder stringBuilder = new StringBuilder(str);

        // nối chuỗi
        StringBuilder stringBuilder1 = stringBuilder.append(" world");
        System.out.println(stringBuilder1);

        // Nối chuỗi theo vị trí chỉ định
        stringBuilder.append("rikkei academy", 6, 14);
        System.out.println(stringBuilder);

        // Chèn theo vị trí
        stringBuilder.insert(0, "Hello and ");
        System.out.println(stringBuilder);

        // Cắt chuỗi
        stringBuilder.delete(0, 10);
        System.out.println(stringBuilder);

        // StringBuffer(đồng bộ)

        int N = 8888888;
        StringBuilder stringBuilder2 = new StringBuilder("sb");
        long t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            stringBuilder.append(i);
        }
        long q = System.currentTimeMillis();
        System.out.println("Thời gian chạy: " + (q - t));


        // Biểu thức chính quy
        // Ví dụ: chuỗi số 0 - 9 có dung 9 kí tự
        // \d{9}

        // So khớp dữ liệu
        // Cách 1:
        Pattern pattern = Pattern.compile("\\d{9}");

        Matcher matcher = pattern.matcher("098455566");
        System.out.println(matcher.matches());

        // Cách 2:
        System.out.println(Pattern.compile("\\d{9}").matcher("099988888").matches());

        // Cách 3:
        System.out.println("0988777999".matches("\\d{9}"));

        // Cách 4:
        boolean check = Pattern.matches("\\d{9}", "05934643552");
        System.out.println(check);
    }
}




























