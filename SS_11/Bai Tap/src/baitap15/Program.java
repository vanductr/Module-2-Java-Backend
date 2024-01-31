package baitap15;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo mã số");
            System.out.println("5. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("6. Sắp xếp sinh viên theo điểm tăng dần");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới để loại bỏ ký tự Enter

            switch (choice) {
                case 1:
                    System.out.println("Danh sách sinh viên:");
                    studentManagement.showAll();
                    break;
                case 2:
                    System.out.println("Nhập thông tin sinh viên mới:");
                    System.out.print("Mã số sinh viên: ");
                    int newStudentId = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới để loại bỏ ký tự Enter
                    System.out.print("Họ và tên: ");
                    String newName = scanner.nextLine();
                    System.out.print("Điểm trung bình: ");
                    double newAverageScore = scanner.nextDouble();

                    Student newStudent = new Student(newStudentId, newName, newAverageScore);
                    studentManagement.addStudent(newStudent);
                    System.out.println("Đã thêm sinh viên mới.");
                    break;
                case 3:
                    System.out.print("Nhập mã số sinh viên cần xóa: ");
                    int studentIdToRemove = scanner.nextInt();
                    studentManagement.removeStudent(studentIdToRemove);
                    break;
                case 4:
                    System.out.print("Nhập mã số sinh viên cần tìm: ");
                    int studentIdToFind = scanner.nextInt();
                    Student foundStudent = studentManagement.findStudentById(studentIdToFind);
                    if (foundStudent != null) {
                        System.out.println("Thông tin sinh viên:");
                        System.out.println(foundStudent);
                    }
                    break;
                case 5:
                    double averageScore = studentManagement.getAverageScore();
                    System.out.println("Điểm trung bình của tất cả sinh viên là: " + averageScore);
                    break;
                case 6:
                    studentManagement.sortByScore();
                    System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm tăng dần:");
                    studentManagement.showAll();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

