package rikkei.model;

import rikkei.validate.InputMethods;
import rikkei.validate.ValidationUtil;

import java.util.Scanner;

public class Department {
    private String departmentId;
    private String departmentName;
    private int totalMembers;

    // Constructor
    public Department() {
    }
    public Department(String departmentId, String departmentName, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    // Phương thức tự tăng số lượng nhân viên khi nhân viên được thêm vào phòng ban
    public void incrementTotalMembers() {
        this.totalMembers++;
    }
    public void minusNumberTotalMembers() {
        this.totalMembers--;
    }

    // Phương thức nhập liệu
    public void inputData() {
        boolean checkId = false;
        while (!checkId) {
            System.out.print("Nhập mã phòng ban (bắt đầu bằng D và có đúng 4 kí tự(vd: D111)): ");
            String departmentId = InputMethods.getString();
            checkId = ValidationUtil.isValidDepartmentId(departmentId);
            if (!checkId) {
                System.out.println("ID Chưa đúng định dạng! Hãy kiểm tra lại.");
            } else {
                this.departmentId = departmentId;
            }
        }

        System.out.print("Nhập tên phòng ban: ");
        this.departmentName = InputMethods.getString();
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Mã phòng ban: " + departmentId);
        System.out.println("Tên phòng ban: " + departmentName);
        System.out.println("Tổng số nhân viên: " + totalMembers);
    }
}

