package baitap6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    public Employee() {
        // Constructor mặc định không tham số
    }

    public Employee(String employeeId, String employeeName, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        calSalary();
    }

    // Lấy dữ liệu nhập vào
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Loại bỏ kí tự Enter

        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();

        System.out.print("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();
        scanner.nextLine(); // Loại bỏ kí tự Enter

        calSalary();
    }

    // Hiển thị thông tin nhân viên
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Lương: " + this.salary);
    }

    // Phương thức tính lương
    public void calSalary() {
        this.salary = this.rate * 1300000;
    }
}

