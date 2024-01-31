package rikkei.service;

import rikkei.model.Department;
import rikkei.model.Employee;
import rikkei.validate.FindEveryThingById;
import rikkei.validate.InputMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepartmentService {
    // Tạo 1 LIST Danh sách các phòng ban
    public static List<Department> departmentList = new ArrayList<>();
    static {
        Department department1 = new Department("D001", "Sales", 50);
        Department department2 = new Department("D002", "Marketing", 40);
        Department department3 = new Department("D003", "Vận Hành", 30);
        Department department4 = new Department("D004", "Đào Tạo", 60);
        Department department5 = new Department("D005", "IT", 100);
        Department department6 = new Department("D006", "Giáo Dục", 20);
        Department department7 = new Department("D007", "Ngoại Giao", 80);

        // Thêm các phòng ban vào danh sách
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);
        departmentList.add(department4);
        departmentList.add(department5);
        departmentList.add(department6);
        departmentList.add(department7);
    }

    // Phương thức Hiển thị danh sách phòng ban
    public static void displayDepartment() {
        if (departmentList.isEmpty()) {
            System.out.println("Danh sách phòng ban trống.");
            return;
        }
        System.out.println("=== Thông tin phòng ban ===");
        for (Department department : departmentList) {
            department.displayInfo();
            System.out.println("----------------------------");
        }
    }
    // Phương thức thêm phòng ban
    public static void addNewDepartment() {
        Department department = new Department();
        System.out.println("=== Nhập thông tin Phòng ban mới: ===");
        department.inputData();
        departmentList.add(department);
        System.out.println("Đã thêm thông tin phòng ban thành công");
    }
    // Chỉnh sửa tên phòng ban
    public static void editDepartmentName() {
        if (departmentList.isEmpty()) {
            System.out.println("Danh sách phòng ban trống.");
            return;
        }
        System.out.print("Nhập ID của phòng ban cần chỉnh sửa: ");
        String departmentId = InputMethods.getString();
        Department department = FindEveryThingById.findDepartmentById(departmentId);
        if (department == null) {
            System.out.println("Không tìm thấy Phòng ban có Id là: " + departmentId);
            return;
        } else {
            System.out.println("===Thông tin của phòng ban trước khi chỉnh sửa:===");
            department.displayInfo();
            System.out.println("=== Sửa thông tin của phòng ban: ===");
            System.out.print("Nhập tên mới của phòng ban: ");
            String newDepartmentName = InputMethods.getString();
            department.setDepartmentName(newDepartmentName);
            System.out.println("Cập nhật thông tin thành công.");
        }
    }
    // Hiển thị danh sách nhân viên của phòng ban theo mã phòng
    public static void displayEmployeeListByDepartmentId() {
        System.out.print("Nhập Mã ID của phòng ban: ");
        String departmentId = InputMethods.getString();

        boolean found = false;

        // Duyệt qua Danh sách tất cả nhân viên
        Department department = FindEveryThingById.findDepartmentById(departmentId);
        if (department != null) {
            System.out.println("=== Danh sách Nhân viên thuộc phòng ban " + department.getDepartmentName() + " :");
            for (Employee employee : EmployeeService.employeeList) {
                if (Objects.equals(employee.getDepartment().getDepartmentId(), departmentId)) {
                    employee.displayInfo();
                    System.out.println("--------------------------------");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên ở phòng ban có ID là: " + departmentId);
        }
    }

    // Xoá phòng ban(Chỉ được xoá khi không có nhân viên)
    public static void deleteDepartment() {
        System.out.print("Nhập Mã ID của phòng ban: ");
        String departmentId = InputMethods.getString();
        Department department = FindEveryThingById.findDepartmentById(departmentId);
        if (department == null) {
            System.out.println("Không tìm thấy phòng ban có id: " + departmentId);
        } else {
            int totalMember = department.getTotalMembers();
            if (totalMember > 0) {
                System.out.println("Không thể xoá phòng ban này vì đang có " + totalMember + " nhân viên.");
            } else {
                departmentList.remove(department);
                System.out.println("Đã xoá phòng ban này thành công.");
            }
        }

    }
}
