package rikkei.validate;

import rikkei.model.Department;
import rikkei.model.Employee;
import rikkei.service.DepartmentService;
import rikkei.service.EmployeeService;

import java.util.Objects;

public class FindEveryThingById {
    // Phương thức tìm kiếm phòng ban thông qua ID
    public static Department findDepartmentById(String id) {
        for (Department department : DepartmentService.departmentList) {
            if (Objects.equals(department.getDepartmentId(), id)) {
                return department;
            }
        }
        return null;
    }

    // Phương thức tìm Nhân viên theo ID
    public static Employee findEmployeeById(String id) {
        for (Employee employee : EmployeeService.employeeList) {
            if (employee.getEmployeeId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
