package baitap12;

public class ReplaceExample {
    public static void main(String[] args) {
        // Chuỗi cần xử lý
        String inputString = "sun is shining, sand is warm, and sea is beautiful.";

        // Thay thế tất cả các từ bắt đầu bằng "s" thành "t"
        String replacedString = replaceWordsStartingWithS(inputString);

        // In ra kết quả
        System.out.println("Chuỗi gốc: " + inputString);
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);
    }

    public static String replaceWordsStartingWithS(String input) {
        // Chia chuỗi thành các từ
        // split: phân tích chuỗi thành các chuỗi con và lưu vào 1 mảng.
        // \\s+: Đây là biểu thức chính quy, đại diện cho 1 hoặc nhiều kí tự khoảng trắng.
        String[] words = input.split("\\s+");

        // Xử lý từng từ
        for (int i = 0; i < words.length; i++) {
            // Nếu từ bắt đầu bằng "s", thì thay thế thành "t"
            if (words[i].startsWith("s")) {
                words[i] = "t" + words[i].substring(1);
            }
        }

        // Ghép các từ lại thành chuỗi mới
        return String.join(" ", words);
    }
}
