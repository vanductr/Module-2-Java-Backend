package rikkei.control;

import rikkei.service.DepartmentService;
import rikkei.validate.InputMethods;

public class DepartmentControl {
    public static void displayMenuDepartmentControl() {
        while (true) {
            System.out.println("=========== QUẢN TRỊ PHÒNG BAN ===============");
            System.out.println("1. Hiển thị danh sách phòng ban");
            System.out.println("2. Thêm mới phòng ban");
            System.out.println("3. Chỉnh sửa tên phòng ban");
            System.out.println("4. Hiển thị danh sách nhân viên của phòng ban theo mã phòng");
            System.out.println("5. Xoá phòng ban");
            System.out.println("0. Thoát");
            System.out.println("-----------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    DepartmentService.displayDepartment();
                    break;
                case 2:
                    DepartmentService.addNewDepartment();
                    break;
                case 3:
                    DepartmentService.editDepartmentName();
                    break;
                case 4:
                    DepartmentService.displayEmployeeListByDepartmentId();
                    break;
                case 5:
                    DepartmentService.deleteDepartment();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
