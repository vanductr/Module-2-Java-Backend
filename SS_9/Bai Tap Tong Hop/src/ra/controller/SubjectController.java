package ra.controller;

import ra.service.ClassesService;
import ra.service.SubjectService;

import java.util.Scanner;

public class SubjectController {
    public static void displaySubjectMenu(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("====================Subject Management=================");
            System.out.println("1. Hiển thị Danh sách Môn học.");
            System.out.println("2. Hiển thị các lớp học theo ID Môn học.");
            System.out.println("3. Thêm Môn học.");
            System.out.println("4. Sửa thông tin Môn học.");
            System.out.println("5. Thay đổi trạng thái môn học.");
            System.out.println("0. Thoát.");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            byte choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    SubjectService.displayAllSubjectList();
                    break;
                case 2:
                    ClassesService.displayClassBySubjectId();
                    break;
                case 3:
                    SubjectService.addNewSubject();
                    break;
                case 4:
                    SubjectService.editSubjectById(scanner);
                    break;
                case 5:
                    SubjectService.changeSubjectStatus(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
