package rikkei.validate;

import java.util.regex.Pattern;

public class ValidationUtil {
    // Biểu thức chính quy để kiểm tra chuỗi có bắt đầu bằng 'D' và có đúng 4 kí tự
    private static final String DEPARTMENT_ID_PATTERN = "^D\\d{3}$";

    // Biểu thức chính quy để kiểm tra chuỗi có bắt đầu bằng 'E' và có đúng 5 kí tự
    private static final String EMPLOYEE_ID_PATTERN = "^E\\d{4}$";

    // Phương thức để kiểm tra chuỗi có đúng định dạng hay không
    public static boolean isValidDepartmentId(String departmentId) {
        return Pattern.matches(DEPARTMENT_ID_PATTERN, departmentId);
    }

    // Phương thức để kiểm tra chuỗi có đúng định dạng hay không
    public static boolean isValidEmployeeId(String employeeId) {
        return Pattern.matches(EMPLOYEE_ID_PATTERN, employeeId);
    }
}
