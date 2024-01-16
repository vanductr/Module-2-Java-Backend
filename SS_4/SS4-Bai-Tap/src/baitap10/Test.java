package baitap10;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student myStudent = new Student();

        // Truy cập và sử dụng các phương thức setter
        System.out.println("Thông tin sinh viên trước khi thay đổi:");
        System.out.println("Tên: " + myStudent.getName());
        System.out.println("Lớp: " + myStudent.getClasses());

        // Thay đổi thông tin bằng cách sử dụng setter
        myStudent.setName("Alice");
        myStudent.setClasses("C03");

        // Hiển thị thông tin sau khi thay đổi
        System.out.println("\nThông tin sinh viên sau khi thay đổi:");
        System.out.println("Tên: " + myStudent.getName());
        System.out.println("Lớp: " + myStudent.getClasses());
    }
}

