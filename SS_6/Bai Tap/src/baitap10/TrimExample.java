package baitap10;

public class TrimExample {
    public static void main(String[] args) {
        // Chuỗi có khoảng trắng ở hai đầu
        String stringWithWhitespace = "   Hello, Java Programming!   ";

        // Sử dụng phương thức trim() để loại bỏ khoảng trắng thừa
        String trimmedString = stringWithWhitespace.trim();

        // In ra kết quả trước và sau khi loại bỏ khoảng trắng
        System.out.println("Chuỗi trước khi loại bỏ khoảng trắng: [" + stringWithWhitespace + "]");
        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: [" + trimmedString + "]");
    }
}
