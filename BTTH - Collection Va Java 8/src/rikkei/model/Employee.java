package rikkei.model;

import rikkei.service.DepartmentService;
import rikkei.validate.FindEveryThingById;
import rikkei.validate.InputMethods;
import rikkei.validate.ValidationUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private LocalDate birthday;
    private boolean sex;
    private BigDecimal salary;
    private Department department;
    private Employee manager;

    public Employee() {
    }
    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, BigDecimal salary, Department department, Employee manager) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.department = department;
        this.manager = manager;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void inputData() {
        boolean checkId = false;
        while (!checkId) {
            System.out.print("Nhập mã nhân viên (bắt đầu bằng E và có đúng 5 kí tự): ");
            String employeeId = InputMethods.getString();
            checkId = ValidationUtil.isValidEmployeeId(employeeId);
            if (!checkId) {
                System.out.println("Id không đúng định dạng! Hãy kiểm tra lại.");
            } else {
                this.employeeId = employeeId;
            }
        }


        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = InputMethods.getString();

        System.out.print("Nhập ngày sinh (định dạng dd/MM/yyyy): ");
        String inputDate = InputMethods.getString();
        LocalDate inputBirthday = LocalDate.parse(inputDate, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        setBirthday(inputBirthday);

        System.out.print("Nhập giới tính (Nam-True/Nữ-False): ");
        this.sex = InputMethods.getBoolean();

        System.out.print("Nhập lương cơ bản: ");
        this.salary = (new Scanner(System.in)).nextBigDecimal();

        System.out.println("Nhập phòng ban: --------------------");
        System.out.println("Đây là danh sách phòng ban hiện có:");
        for (Department department : DepartmentService.departmentList) {
            department.displayInfo();
            System.out.println("---------------------------------------");
        }
        System.out.print("Nhập ID Phòng ban để thêm phòng ban cho nhân viên: ");
        String departmentId = InputMethods.getString();
        Department department =  FindEveryThingById.findDepartmentById(departmentId);
        if (department == null) {
            System.out.println("Không tìm thấy phòng ban có Id: " + departmentId);
        } else {
            if (Objects.equals(department.getDepartmentId(), departmentId)) {
                this.department = department;

                // Tăng totalMembers của phòng ban
                department.incrementTotalMembers();
            }
        }
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Ngày sinh: " + birthday);
        System.out.println("Giới tính: " + (sex ? "Nam" : "Nữ"));
        System.out.println("Lương cơ bản: " + salary);
        System.out.println("Phòng ban: " + department.getDepartmentName());
        if (getManager() != null) {
            System.out.println("Quản lí: " + getManager().getEmployeeName());
        } else {
            System.out.println("Không có quản lí.");
        }
    }

    public void displayIdAndName() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
    }
}
