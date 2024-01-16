package baitap7;

public class Main {
    public static void main(String[] args) {
        // Bước 2: Khởi tạo đối tượng từ lớp MyClass
        MyClass myObject = new MyClass();

        // Hiển thị giá trị thuộc tính myString của đối tượng vừa tạo
        System.out.println("Giá trị myString ban đầu: " + myObject.getMyString());

        // Bước 3: Thay đổi giá trị thuộc tính myString và hiển thị lại giá trị mới
        // Sử dụng set để thay đổi gía trị của myString.
        myObject.setMyString("Giá trị đã được thay đổi.");

        // Sử dụng get để lấy giá trị trả về.
        System.out.println("Giá trị myString sau khi thay đổi: " + myObject.getMyString());
    }
}

