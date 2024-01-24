package ra.controller;

import ra.service.ClassesService;
import ra.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    // Phương thức Hiển thị Menu quản lí Giảng viên
    public static void displayTeacherManagementMenu(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("================TEACHER MANAGEMENT=================");
            System.out.println("1. Hiển thị danh sách tất cả Danh sách Giảng viên.");
            System.out.println("2. Hiển thị các lớp học theo Teacher ID.");
            System.out.println("3. Thêm Giảng viên mới.");
            System.out.println("4. Sửa thông tin Giảng viên.");
            System.out.println("5. Thay đổi trạng thái Giảng viên.");
            System.out.println("6. Tìm kiếm theo tên Giảng viên.");
            System.out.println("0. Thoát.");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    TeacherService.displayTeacherData();
                    break;
                case 2:
                    ClassesService.displayClassByTeacherId(scanner);
                    break;
                case 3:
                    TeacherService.inputTeacherData(scanner);
                    break;
                case 4:
                    TeacherService.updateTeacher(scanner);
                    break;
                case 5:
                    TeacherService.changeTeacherStatusById();
                    break;
                case 6:
                    TeacherService.searchTeacherByName(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }
}
