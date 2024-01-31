package rikkei.management;

import rikkei.control.DepartmentControl;
import rikkei.control.EmployeeControl;
import rikkei.validate.InputMethods;

public class Management {
    public static void main(String[] args) {
        while (true) {
            System.out.println("=============== MENU QUẢN TRỊ =================");
            System.out.println("1.Quản trị phòng ban");
            System.out.println("2.Quản trị nhân viên");
            System.out.println("0. Thoát");
            System.out.println("------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    DepartmentControl.displayMenuDepartmentControl();
                    break;
                case 2:
                    EmployeeControl.displayEmployeeControl();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
