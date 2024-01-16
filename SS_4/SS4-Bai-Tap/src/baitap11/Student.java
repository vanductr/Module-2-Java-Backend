package baitap11;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    // Phương thức khởi tạo không tham số
    public Student() {

    }

    // Constructor
    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    // Getter và Setter cho từng thuộc tính
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Phương thức inputData() cho phép nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.studentId = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter

        System.out.print("Nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();

        System.out.print("Nhập giới tính (true nếu nam, false nếu nữ): ");
        this.sex = scanner.nextBoolean();
        scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter

        System.out.print("Nhập lớp: ");
        this.className = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter

        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }

    // Phương thức displayData() hiển thị toàn bộ thông tin của đối tượng
    public void displayData() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lớp: " + className);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }
}

