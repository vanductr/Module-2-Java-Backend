package baitap5;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // Phương thức khởi tạo không tham số.
    public Student() {

    }

    // Phương thức khởi tạo có tham số.
    public Student(String studentCode, String studentName, int age, String gender, String address, String phoneNumber) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Phương thức nhập thông tin học sinh.
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã học sinh: ");
        studentCode = scanner.nextLine();

        System.out.print("Nhập tên học sinh: ");
        studentName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter.

        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phoneNumber = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin học sinh
    public void displayData() {
        System.out.println("Mã học sinh: " + studentCode);
        System.out.println("Tên học sinh: " + studentName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số điện thoại: " + phoneNumber);
    }

    // Phương thức getter cho studentCode
    public String getStudentCode() {
        return studentCode;
    }

}
























