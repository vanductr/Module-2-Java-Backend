package baitap4;

public class SplitString {
    public static String[] splitStringIntoWords(String input) {
        // Sử dụng phương thức split() của lớp String để tách chuỗi thành mảng các từ
        String[] words = input.split("\\s+");

        return words;
    }

    public static void main(String[] args) {
        // Chuỗi ban đầu
        String inputString = "This is a sample string.";

        // Gọi phương thức để tách chuỗi thành mảng các từ
        String[] wordsArray = splitStringIntoWords(inputString);

        // In ra kết quả
        System.out.println("Chuỗi ban đầu: " + inputString);
        System.out.print("Mảng các từ: ");
        for (String word : wordsArray) {
            System.out.print(word + " ");
        }
    }
}

