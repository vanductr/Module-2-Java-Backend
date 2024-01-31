package baitap11;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int studentCount;

    public StudentManager(int capacity) {
        this.students = new Student[capacity];
        this.studentCount = 0;
    }

    // Phương thức thêm mới sinh viên
    public void createStudent() {
        if (studentCount < students.length) {
            Student newStudent = new Student();
            newStudent.inputData();
            students[studentCount] = newStudent;
            studentCount++;
            System.out.println("Thêm mới sinh viên thành công.");
        } else {
            System.out.println("Danh sách sinh viên đã đầy. Không thể thêm mới.");
        }
    }

    // Phương thức cập nhật thông tin sinh viên theo mã sinh viên
    public void updateStudent(int studentId) {
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                System.out.println("Thông tin sinh viên trước khi cập nhật:");
                students[i].displayData();

                System.out.println("Nhập thông tin sinh viên mới:");
                students[i].inputData();

                System.out.println("Cập nhật thông tin sinh viên thành công.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có mã " + studentId);
        }
    }

    // Phương thức hiển thị danh sách sinh viên
    public void showAllStudent() {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Sinh viên thứ " + (i + 1) + ":");
                students[i].displayData();
            }
        }
    }

    // Phương thức xoá sinh viên theo mã sinh viên
    public void deleteStudent(int studentId) {
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                System.out.println("Thông tin sinh viên cần xoá:");
                students[i].displayData();

                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }

                studentCount--;
                System.out.println("Xoá sinh viên thành công.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có mã " + studentId);
        }
    }

    // Phương thức main để thực hiện chương trình quản lý sinh viên
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(100);

        int choice;

        do {
            System.out.println("Menu chức năng:");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã");
            System.out.println("4. Xoá sinh viên theo mã");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới để loại bỏ kí tự Enter

            switch (choice) {
                case 1:
                    studentManager.showAllStudent();
                    break;
                case 2:
                    studentManager.createStudent();
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần cập nhật: ");
                    int updateStudentId = scanner.nextInt();
                    studentManager.updateStudent(updateStudentId);
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xoá: ");
                    int deleteStudentId = scanner.nextInt();
                    studentManager.deleteStudent(deleteStudentId);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

