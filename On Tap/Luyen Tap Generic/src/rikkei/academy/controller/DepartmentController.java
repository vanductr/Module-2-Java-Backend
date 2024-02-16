package rikkei.academy.controller;

import rikkei.academy.model.Department;
import rikkei.academy.service.DepartmentService;
import rikkei.academy.service.IDepartmentService;
import rikkei.academy.validate.InputMethods;

public class DepartmentController {
    private IDepartmentService departmentService = new DepartmentService();

    public DepartmentController() {
        while (true) {
            System.out.println("****************** MENU ***********************");
            System.out.println("1. Hiển thị danh sách phòng ban");
            System.out.println("2. Thêm mới phòng ban");
            System.out.println("3. Chỉnh sửa tên phòng ban");
            System.out.println("4. Hiển thị danh sách nhân viên phòng ban theo mã phòng");
            System.out.println("5. Xoá phòng ban(Chỉ xoá khi không có nhân viên nào)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    handleShowAll();
                    break;
                case 2:
                    handleAddNewDepartment();
                    break;
                case 3:
                    handleEditDepartment();
                    break;
                case 4:
                    handleShowEmployeeByDepartmentId();
                    break;
                case 5:
                    handleDeleteDepartment();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
    public void handleShowAll() {
        for (Department department : departmentService.findAll()) {
            department.displayData();
        }
    }
    public void handleAddNewDepartment() {
        System.out.print("Nhập số lượng cần thêm: ");
        int n = InputMethods.getInteger();
        for (int i = 0; i < n; i++) {
            Department department = new Department();
            department.inputData(departmentService);
            departmentService.save(department);
        }
    }
    public void handleEditDepartment() {

    }
    public void handleShowEmployeeByDepartmentId() {

    }
    public void handleDeleteDepartment() {

    }
}
