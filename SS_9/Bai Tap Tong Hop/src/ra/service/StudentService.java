package ra.service;

import ra.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public static final List<Student> studentList = new ArrayList<>();



    // Phương thức thêm học sinh mới
    public static void addNewStudent() {
        Student newStudent = new Student();
        newStudent.inputStudentData();
        studentList.add(newStudent);
        System.out.println("Đã thêm học sinh mới thành công.");
    }

    // Phương thức hiển thị thông tin học sinh
    public static void displayStudentInfo() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
            return;
        }

        System.out.println("Danh sách thông tin học sinh:");
        for (Student student : studentList) {
            student.displayStudentData();
            System.out.println("--------------------");
        }
    }

    // Phương thức chỉnh sửa thông tin học sinh qua Id
    public static void editStudentInfoById(Scanner scanner) {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống!!!");
            return;
        }

        System.out.print("Nhập ID của Học viên cần chỉnh sửa: ");
        int studentId = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                System.out.println("Thông tin trước khi chỉnh sửa:");
                student.displayStudentData();

                // Chỉnh sửa thông tin học sinh
                student.inputStudentData();

                System.out.println("Thông tin sau khi chỉnh sửa:");
                student.displayStudentData();
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với ID: " + studentId);
    }

    // Phương thức thay đổi trạng thái học sinh thông qua ID
    public static void changeStudentStatusById() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống!!!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của Học viên muốn đổi trạng thái: ");
        int studentId = Integer.parseInt(scanner.nextLine());

        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                System.out.println("Trạng thái hiện tại của học sinh:");
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Tên: " + student.getStudentName());
                System.out.println("Trạng thái: " + student.getStudentStatus().getLabel());

                System.out.print("Nhập trạng thái mới (1 - Đang học, 2 - On Job Training, 3 - Đã tốt nghiệp): ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        student.setStudentStatus(Student.StudentStatus.DANG_HOC);
                        break;
                    case 2:
                        student.setStudentStatus(Student.StudentStatus.ON_JOB_TRAINING);
                        break;
                    case 3:
                        student.setStudentStatus(Student.StudentStatus.DA_TOT_NGHIEP);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Giữ nguyên trạng thái cũ.");
                        break;
                }

                System.out.println("Trạng thái sau khi thay đổi:");
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Tên: " + student.getStudentName());
                System.out.println("Trạng thái: " + student.getStudentStatus().getLabel());

                return;
            }
        }

        System.out.println("Không tìm thấy học sinh với ID: " + studentId);
    }

    // Phương thức tìm kiếm học sinh theo tên
    public static void searchStudentByName(Scanner scanner) {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống!!!");
            return;
        }

        System.out.println();
        System.out.print("Nhập tên của Học viên muốn tìm kiếm: ");
        String studentName = scanner.nextLine();

        boolean found = false;

        System.out.println("Kết quả tìm kiếm học sinh có tên \"" + studentName + "\":");
        for (Student student : studentList) {
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Tên: " + student.getStudentName());
                System.out.println("Ngày sinh: " + student.getDateOfBirth());
                System.out.println("Trạng thái: " + student.getStudentStatus().getLabel());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh có tên \"" + studentName + "\"");
        }
    }
}

