package rikkei.academy;

import java.util.LinkedList;
import java.util.Queue;

class Employee {
    String name;
    String gender;
    String dob; // Ngày tháng năm sinh

    public Employee(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + " | " + gender + " | " + dob;
    }
}

public class DemergingAlgorithm {
    public static void main(String[] args) {
        // Đọc dữ liệu từ file hoặc nguồn nào đó
        // Giả sử dữ liệu đã được sắp xếp theo ngày tháng năm sinh
        Employee[] employees = {
                new Employee("Hạnh", "Female", "01/05/1990"),
                new Employee("Bảo", "Male", "15/03/1985"),
                new Employee("Nam", "Male", "20/11/1992"),
                new Employee("Tươi", "Female", "05/08/1988"),
                new Employee("Hà", "Female", "10/02/1995")
        };

        // Tạo 2 queue: NU và NAM
        Queue<Employee> nuQueue = new LinkedList<>();
        Queue<Employee> namQueue = new LinkedList<>();

        // Phân loại nhân viên vào từng queue tương ứng
        for (Employee employee : employees) {
            if (employee.gender.equals("Female")) {
                nuQueue.add(employee);
            } else {
                namQueue.add(employee);
            }
        }

        // Hiển thị kết quả ra màn hình console
        System.out.println("Dữ liệu sau khi được sắp xếp:");

        // Xét queue NU và hiển thị
        System.out.println("Nữ:");
        while (!nuQueue.isEmpty()) {
            System.out.println(nuQueue.poll());
        }

        // Xét queue NAM và hiển thị
        System.out.println("Nam:");
        while (!namQueue.isEmpty()) {
            System.out.println(namQueue.poll());
        }
    }
}


