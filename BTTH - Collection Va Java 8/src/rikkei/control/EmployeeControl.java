package rikkei.control;

import rikkei.service.EmployeeService;
import rikkei.validate.InputMethods;

public class EmployeeControl {
    public static void displayEmployeeControl() {
        while (true) {
            System.out.println("============== QUẢN TRỊ NHÂN VIÊN ==============");
            System.out.println("1. Hiển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)");
            System.out.println("2. Xem chi tiết thông tin nhân viên theo mã nhân viên(toàn bộ thông tin)");
            System.out.println("3. Thêm mới nhân viên");
            System.out.println("4. Chỉnh sửa thông tin nhân viên");
            System.out.println("5. Xoá nhân viên");
            System.out.println("6. Thống kê số lượng nhân viên trung bình của mỗi phòng");
            System.out.println("7. Tìm ra 5 phòng có số lượng nhân viên đông nhất");
            System.out.println("8. Tìm ra người quản lí nhiều nhân viên nhất");
            System.out.println("9. Tìm ra 5 nhân viên có tuổi cao nhất công ty");
            System.out.println("10. Tìm ra 5 nhân viên hưởng lương cao nhất");
            System.out.println("0. Thoát");
            System.out.println("---------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    EmployeeService.displayAllEmployeeInfor();
                    break;
                case 2:
                    EmployeeService.displayEmployeeById();
                    break;
                case 3:
                    EmployeeService.addNewEmployee();
                    break;
                case 4:
                    EmployeeService.editEmployeeInfo();
                    break;
                case 5:
                    EmployeeService.deleteEmployee();
                    break;
                case 6:
                    EmployeeService.getAverageEmployeesPerDepartment();
                    break;
                case 7:
                    EmployeeService.findTop5DepartmentsByEmployeeCount();
                    break;
                case 8:
                    EmployeeService.findManagerWithMostEmployees();
                    break;
                case 9:
                    EmployeeService.findTop5OldestEmployees();
                    break;
                case 10:
                    EmployeeService.findTop5HighestPaidEmployees();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
