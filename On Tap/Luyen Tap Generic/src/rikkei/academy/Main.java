package rikkei.academy;

import rikkei.academy.controller.DepartmentController;
import rikkei.academy.service.DepartmentService;
import rikkei.academy.validate.InputMethods;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("****************** MENU ***********************");
            System.out.println("1. Quản lý phòng ban");
            System.out.println("2. Quản lý nhân viên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    new DepartmentController();
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
