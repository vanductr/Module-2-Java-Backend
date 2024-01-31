package rikkei.service;

import rikkei.model.Department;
import rikkei.model.Employee;
import rikkei.validate.FindEveryThingById;
import rikkei.validate.InputMethods;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    // Tạo 1 danh sách chứa các Nhân viên
    public static List<Employee> employeeList = new ArrayList<>();
    static {
        addEmployeesToList();
    }

//    HIển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)
    public static void displayAllEmployeeInfor() {
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
        }
        System.out.println("=== Thông tin tất cả nhân viên: ===");
        for (Employee employee : employeeList) {
            employee.displayIdAndName();
            System.out.println("---------------------------------");
        }
    }
//    Xem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)
    public static void displayEmployeeById() {
        System.out.print("Nhập ID của Nhân viên cần xem thông tin: ");
        String employeeId = InputMethods.getString();
        boolean found = false;
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployeeId(), employeeId)) {
                employee.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có id " + employeeId);
        }
    }
//    Thêm mới nhân viên
    public static void addNewEmployee() {
        System.out.print("Nhập số lượng nhân viên cần thêm: ");
        int employeeQuantity = InputMethods.getInteger();
        for (int i = 0; i < employeeQuantity; i++) {
            System.out.println("Nhập thông tin của nhân viên thứ " + (i + 1) + " : ");
            Employee employee = new Employee();
            employee.inputData();
            employeeList.add(employee);
        }
        System.out.println("Đã thêm thành công thông tin nhân viên.");
    }
//    Chỉnh sửa thông tin nhân viên
    public static void editEmployeeInfo() {
        System.out.print("Nhập id của Nhân viên cần chỉnh sửa: ");
        String employeeId = InputMethods.getString();
        boolean found = false;
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployeeId(), employeeId)) {
                System.out.println("Thông tin của Nhân viên trước khi sửa");
                employee.displayInfo();
                System.out.println("-----------------------------------");
                System.out.print("Nhập tên Nhân viên: ");
                employee.setEmployeeName(InputMethods.getString());
                System.out.print("Nhập ngày sinh (định dạng dd/MM/yyyy): ");
                String inputDate = InputMethods.getString();
                LocalDate inputBirthday = LocalDate.parse(inputDate, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                employee.setBirthday(inputBirthday);
                System.out.print("Nhập giới tính (Nam-True/Nữ-False): ");
                employee.setSex(InputMethods.getBoolean());
                System.out.print("Nhập lương cơ bản: ");
                employee.setSalary((new Scanner(System.in)).nextBigDecimal());

                System.out.println("Nhập phòng ban: --------------------");
                String oldIdDepartment = employee.getDepartment().getDepartmentId();
                Department oldDepartment = FindEveryThingById.findDepartmentById(oldIdDepartment);

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
                        employee.setDepartment(department);

                        // Tăng totalMembers của phòng ban
                        department.incrementTotalMembers();

                        // Giảm phòng ban cũ đi 1
                        oldDepartment.minusNumberTotalMembers();
                    }
                }
                System.out.println("Đã cập nhật thông tin thành công.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên có id " + employeeId);
        }
    }

//    Xóa nhân viên
    public static void deleteEmployee() {
        System.out.print("Nhập ID của nhân viên cần xoá: ");
        String employeeId = InputMethods.getString();
        boolean found = false;
        if(FindEveryThingById.findEmployeeById(employeeId) != null){
            employeeList.remove(FindEveryThingById.findEmployeeById(employeeId));
            found =true;
            System.out.println("Đã xoá nhân viên thành công.");
        }
        if (!found) {
            System.out.println("Không tìm thấy Nhân viên có id: " + employeeId);
        }
    }

//    Thống kê số lượng nhân viên trung bình của mỗi phòng
    public static void getAverageEmployeesPerDepartment() {
        System.out.print("Số lượng nhân viên trung bình của mỗi phòng là: ");
        int totalMemberAllDapartment = 0;
        for (Department department : DepartmentService.departmentList) {
            totalMemberAllDapartment += department.getTotalMembers();
        }
        double averageEmployees = (double) totalMemberAllDapartment / (DepartmentService.departmentList.size());
        System.out.println(averageEmployees);
    }

//    Tìm ra 5 phòng có số lượng nhân viên đông nhất
    public static void findTop5DepartmentsByEmployeeCount() {
        System.out.println("5 Phòng có số lượng nhân viên đông nhất là: =======");
        DepartmentService.departmentList.sort((o1, o2) -> o2.getTotalMembers() - o1.getTotalMembers());
        if (DepartmentService.departmentList.size() < 5) {
            for (Department department : DepartmentService.departmentList) {
                department.displayInfo();
                System.out.println("---------------------------");
            }
        } else {
            for (int i = 0; i < 5; i++) {
                DepartmentService.departmentList.get(i).displayInfo();
                System.out.println("---------------------------");
            }
        }
    }
//    Tìm ra người quản lý nhiều  nhân viên nhất
    public static void findManagerWithMostEmployees() {
        Map<Employee, Integer> managerEmployeeCountMap = new HashMap<>();
        for (Employee employee : EmployeeService.employeeList) {
            Employee manager = employee.getManager();
            if (manager != null) {
                managerEmployeeCountMap.put(manager, managerEmployeeCountMap.getOrDefault(manager, 0) + 1);
            }
        }

        // Tìm người quản lí có số lượng nhân viên nhiều nhất
        Employee managerWithMostEmployees = null;
        int maxEmployeeCount = 0;
        for (Map.Entry<Employee, Integer> entry : managerEmployeeCountMap.entrySet()) {
            if (entry.getValue() > maxEmployeeCount) {
                maxEmployeeCount = entry.getValue();
                managerWithMostEmployees = entry.getKey();
            }
        }

        System.out.print("Quản lí có nhiều nhân viên nhất là: ");
        System.out.println(managerWithMostEmployees.getEmployeeName());
    }
//    Tìm ra 5 nhân viên có tuổi cao nhất công ty
    public static void findTop5OldestEmployees() {
        // Sắp xếp danh sách nhân viên theo tuổi giảm dần
        List<Employee> sortedEmployees = EmployeeService.employeeList.stream()
                .sorted(Comparator.comparing(Employee::getBirthday))
                .toList();

        // Chọn ra 5 nhân viên có tuổi cao nhất
        List<Employee> top5OldestEmployees = sortedEmployees.stream().limit(5).toList();
        System.out.println("5 Nhân viên có tuổi cao nhất là: ====");
        for (Employee top5OldestEmployee : top5OldestEmployees) {
            top5OldestEmployee.displayInfo();
            System.out.println("---------------------------------");
        }
    }
//    Tìm ra 5 nhân viên hưởng lương cao nhất
    public static void findTop5HighestPaidEmployees() {
        // Sắp xếp danh sách nhân viên theo lương giảm dần
        List<Employee> sortedEmployees = EmployeeService.employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        // Chọn ra 5 nhân viên có lương cao nhất
        List<Employee> top5HighestPaidEmployees = sortedEmployees.stream().limit(5).toList();
        System.out.println("Top 5 nhân viên có lương cao nhất là:");
        for (Employee top5HighestPaidEmployee : top5HighestPaidEmployees) {
            top5HighestPaidEmployee.displayInfo();
            System.out.println("-------------------------------");
        }
    }

    // Phương thức để thêm các đối tượng Employee vào employeeList
    public static void addEmployeesToList() {
        // Tạo đối tượng Department để sử dụng
        Department department = new Department("D001", "Sales", 50);

        // Tạo đối tượng Employee và thêm vào mảng employeeList
        Employee employee1 = new Employee("E001", "John Doe", LocalDate.of(1990, 1, 15), true, BigDecimal.valueOf(5000), department, null);
        Employee employee2 = new Employee("E002", "Jane Smith", LocalDate.of(1985, 5, 20), false, BigDecimal.valueOf(6000), department, null);
        Employee employee3 = new Employee("E003", "Bob Johnson", LocalDate.of(1995, 10, 10), true, BigDecimal.valueOf(4500), department, employee2);
        Employee employee4 = new Employee("E004", "Tran Van A", LocalDate.of(1991, 11, 15), false, BigDecimal.valueOf(5500), department, employee1);
        Employee employee5 = new Employee("E005", "Nguyen Van B", LocalDate.of(1999, 6, 14), false, BigDecimal.valueOf(9500), department, employee1);
        Employee employee6 = new Employee("E006", "Cao Xuan C", LocalDate.of(2000, 7, 5), true, BigDecimal.valueOf(10500), department, employee2);
        Employee employee7 = new Employee("E007", "Doan Thi D", LocalDate.of(1996, 2, 18), false, BigDecimal.valueOf(8500), department, employee2);
        Employee employee8 = new Employee("E008", "Giàng A Pháo", LocalDate.of(1992, 12, 27), true, BigDecimal.valueOf(14500), department, employee2);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
    }

}
