package ra.controller;

import ra.service.ClassesService;

import java.util.Scanner;

public class ClassesController {
    // Phương thức hiển thị Menu Quản lí chức năng của Classes
    public static void displayMenuClassesManagement(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("============ CLASSES MANAGEMENT ==============");
            System.out.println("1. Hiển thị thông tin tất cả Lớp học.");
            System.out.println("2. Thêm lớp học mới.");
            System.out.println("3. Sửa thông tin lớp học.");
            System.out.println("4. Thay đổi trạng thái lớp học.");
            System.out.println("5. Tìm kiếm theo Tên lớp.");
            System.out.println("6. Tìm kiếm theo Tên Giảng viên.");
            System.out.println("7. Tìm kiếm theo Môn học.");
            System.out.println("0. Thoát.");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            int choise = Integer.parseInt(scanner.nextLine());

            switch (choise) {
                case 1:
                    ClassesService.displayAllClasses();
                    break;
                case 2:
                    ClassesService.addNewClass();
                    break;
                case 3:
                    break;
                case 4:
                    ClassesService.changeClassStatusById();
                    break;
                case 5:
                    ClassesService.searchClassesByClassName(scanner);
                    break;
                case 6:
                    ClassesService.searchClassesByTeacherName(scanner);
                    break;
                case 7:
                    ClassesService.searchClassesBySubjectName(scanner);
                    break;
                case 0:
                    return;
            }
        }
    }
}
