package ra.run;

import ra.controller.ClassesController;
import ra.controller.StudentController;
import ra.controller.SubjectController;
import ra.controller.TeacherController;

import java.util.Scanner;

public class RikkeiManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=====================RIKKEI MANAGEMENT=======================");
            System.out.println("1. Quản lí Subject(Môn học).");
            System.out.println("2. Quản lí Student(Học viên).");
            System.out.println("3. Quản lí Teacher(Giảng viên).");
            System.out.println("4. Quản lí Classes(Lớp học).");
            System.out.println("0. Thoát.");

            System.out.println();
            System.out.print("Nhập lựa chọn: ");
            byte choise = Byte.parseByte(scanner.nextLine());

            switch (choise) {
                case 1:
                    SubjectController.displaySubjectMenu(scanner);
                    break;
                case 2:
                    StudentController.displayStudentManagementMenu(scanner);
                    break;
                case 3:
                    TeacherController.displayTeacherManagementMenu(scanner);
                    break;
                case 4:
                    ClassesController.displayMenuClassesManagement(scanner);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
