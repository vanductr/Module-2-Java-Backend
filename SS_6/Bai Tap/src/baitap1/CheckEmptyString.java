package baitap1; // Kiểm tra xem 1 chuỗi có rỗng hay không

public class CheckEmptyString {
    public static void main(String[] args) {
        // Khai báo biến kiểu String
        String testString = "Hello, World!";

        // Kiểm tra chuỗi có rỗng hay không và đưa ra thông báo
        if (testString.isEmpty()) {
            System.out.println("Đây là 1 chuỗi rỗng.");
        } else {
            System.out.println("Đây là 1 chuỗi không rỗng.");
        }
    }
}
