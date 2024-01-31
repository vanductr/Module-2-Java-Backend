package baitap6;

public class InsertStringExample {
    public static void main(String[] args) {
        // Tạo đối tượng StringBuilder với nội dung ban đầu
        StringBuilder stringBuilder = new StringBuilder("Hello, Java!");

        // Chuỗi cần chèn
        String insertString = "World ";

        // Vị trí muốn chèn chuỗi (ở đây là sau từ "Hello")
        int position = 6;

        // Sử dụng phương thức insert() để chèn chuỗi vào vị trí quy định
        stringBuilder.insert(position, insertString);

        // In ra chuỗi kết quả
        System.out.println("Chuỗi sau khi chèn: " + stringBuilder.toString());
    }
}
