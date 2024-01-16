package baitap9;

public class ContainsExample {
    public static void main(String[] args) {
        // Chuỗi ban đầu
        String mainString = "Hello, Java Programming!";

        // Chuỗi con cần kiểm tra
        String subString = "Java";

        // Sử dụng phương thức contains() để kiểm tra
        boolean containsSubstring = mainString.contains(subString);

        // In ra kết quả
        if (containsSubstring) {
            System.out.println("Chuỗi chứa chuỗi con.");
        } else {
            System.out.println("Chuỗi không chứa chuỗi con.");
        }
    }
}

