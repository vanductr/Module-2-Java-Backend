package ra.controller;

import ra.service.StudentService;
import ra.service.SubjectService;

import java.util.Scanner;

public class StudentController {
    public static void displayStudentManagementMenu(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("====================Student Management=================");
            System.out.println("1. Hiển thị Danh sách tất cả Học viên.");
            System.out.println("2. Thêm học viên mới.");
            System.out.println("3. Sửa thông tin học viên.");
            System.out.println("4. Thay đổi trạng thái Học viên.");
            System.out.println("5. Tìm kiếm Học viên theo tên.");
            System.out.println("0. Thoát.");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            byte choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    StudentService.displayStudentInfo();
                    break;
                case 2:
                    StudentService.addNewStudent();
                    break;
                case 3:
                    StudentService.editStudentInfoById(scanner);
                    break;
                case 4:
                    StudentService.changeStudentStatusById();
                    break;
                case 5:
                    StudentService.searchStudentByName(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
