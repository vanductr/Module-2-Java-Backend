package ra.service;

import ra.model.Student;
import ra.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService {
    // Khai báo 1 mảng các Giảng viên
    public static final List<Teacher> teacherList = new ArrayList<>();

    // Phương thức tìm Teacher thông qua ID
    public static Teacher findTeacherById(int teacherId) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    // Phương thức lấy thông tin của Giảng viên do người dùng nhập vào
    public static void inputTeacherData(Scanner scanner) {
        // Hướng dẫn người dùng nhập vào
        System.out.println("-----Nhập thông tin của Giảng viên mới-----");

        Teacher teacher = new Teacher();
        teacher.inputTeacherData(); // Gọi phương thức nhập liệu từ class Teacher

        // Thêm Giảng viên mới vào danh sách
        teacherList.add(teacher);
        System.out.println("Thông tin Giảng viên đã được thêm vào danh sách.");
    }

    // Phương thức hiển thị thông tin của Giảng viên
    public static void displayTeacherData() {
        if (teacherList.isEmpty()) {
            System.out.println();
            System.out.println("Danh sách Giảng viên trống!!!");
            return;
        }

        System.out.println("-----Danh sách tất cả Giảng viên:------");
        System.out.println();
        for (Teacher teacher : teacherList) {
            teacher.displayTeacherData(); // Gọi phương thức hiển thị thông tin từ class Teacher
            System.out.println("--------------------");
        }
    }

    // Phương thức thay đổi thông tin Giảng viên
    public static void updateTeacher(Scanner scanner) {
        if (teacherList.isEmpty()) {
            System.out.println();
            System.out.println("Danh sách Giảng viên trống!!!");
            return;
        }

        System.out.println();
        System.out.print("Nhập ID của Giảng viên cần chỉnh sửa: ");
        int teacherId = Integer.parseInt(scanner.nextLine());
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                // Tìm thấy giảng viên với ID tương ứng, cập nhật thông tin
                teacher.inputTeacherData();
                System.out.println("Thông tin giảng viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy giảng viên với ID: " + teacherId);
    }

    // Phương thức thay đổi trạng thái Giảng viên
    public static void changeTeacherStatusById() {
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách Giảng viên trống!!!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID của Giảng viên muốn đổi trạng thái: ");
        int teacherId = Integer.parseInt(scanner.nextLine());

        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                System.out.println("Trạng thái hiện tại của Giảng viên:");
                System.out.println("ID: " + teacher.getTeacherId());
                System.out.println("Tên: " + teacher.getTeacherName());
                System.out.println("Trạng thái: " + teacher.getTeacherStatus().getLabel());

                System.out.print("Nhập trạng thái mới (1 - Đang dạy, 2 - Nghỉ phép, 3 - Đã nghỉ việc.): ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        teacher.setTeacherStatus(Teacher.TeacherStatus.DANG_DAY);
                        break;
                    case 2:
                        teacher.setTeacherStatus(Teacher.TeacherStatus.NGHI_PHEP);
                        break;
                    case 3:
                        teacher.setTeacherStatus(Teacher.TeacherStatus.DA_NGHI_VIEC);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Giữ nguyên trạng thái cũ.");
                        break;
                }

                System.out.println("Trạng thái sau khi thay đổi:");
                System.out.println("ID: " + teacher.getTeacherId());
                System.out.println("Tên: " + teacher.getTeacherName());
                System.out.println("Trạng thái: " + teacher.getTeacherStatus().getLabel());

                return;
            }
        }

        System.out.println("Không tìm thấy học sinh với ID: " + teacherId);
    }

    // Phương thức tìm kiếm Giảng viên theo tên
    public static void searchTeacherByName(Scanner scanner) {
        if (teacherList.isEmpty()) {
            System.out.println("Danh sách Giảng viên trống!!!");
            return;
        }

        System.out.println();
        System.out.print("Nhập tên của Giảng viên muốn tìm kiếm: ");
        String teacherName = scanner.nextLine();

        boolean found = false;

        System.out.println("Kết quả tìm kiếm học sinh có tên \"" + teacherName + "\":");
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherName().equalsIgnoreCase(teacherName)) {
                System.out.println("ID: " + teacher.getTeacherId());
                System.out.println("Tên: " + teacher.getTeacherName());
                System.out.println("Trạng thái: " + teacher.getTeacherStatus().getLabel());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy học sinh có tên \"" + teacherName + "\"");
        }
    }
}
