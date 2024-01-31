package baitap6;

public class Main {
    public static void main(String[] args) {
        // Tạo 1 mảng các đối tượng Nhân viên từ Class Employee (ví dụ 5 nhân viên)
        Employee[] employees = new Employee[5]; // Gọi phương thức Employee mặc định không tham số.

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(); // Khởi tạo đối tượng, và sắp xếp vào trong mảng.
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            employees[i].inputData(); // Gọi phương thức inputData cho từng đối tượng.
            System.out.println(); // Cách dòng
        }

        System.out.println("Thông tin toàn bộ nhân viên:");
        for (Employee employee : employees) { // Vòng lặp qua từng phần tử trong mảng
            employee.displayData(); // Hiển thị từng phần tử trong mảng
            System.out.println(); // Dòng ngăn cách giữa các nhân viên
        }
    }
}

