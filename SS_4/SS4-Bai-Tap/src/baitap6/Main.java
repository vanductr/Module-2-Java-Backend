package baitap6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ":");
            employees[i].inputData();
            System.out.println();
        }

        System.out.println("Thông tin toàn bộ nhân viên:");
        for (Employee employee : employees) {
            employee.displayData();
            System.out.println();
        }
    }
}

