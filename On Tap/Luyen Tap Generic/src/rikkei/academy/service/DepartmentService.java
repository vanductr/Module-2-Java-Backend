package rikkei.academy.service;

import rikkei.academy.model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService implements IDepartmentService{
    private static List<Department> departments = new ArrayList<>();

    @Override
    public List<Department> findAll() {
        return departments;
    }

    @Override
    public Department findById(String id) {
        for (Department department : departments) {
            if (department.getDepartmentId().equals(id)) {
                return department;
            }
        }
        return null;
    }

    @Override
    public void save(Department department) {
        if (department.getDepartmentId() == null) {
            department.setDepartmentId(getNewId());
            departments.add(department);
        } else {
            departments.set(departments.indexOf(findById(department.getDepartmentId())), department);
        }
    }

    @Override
    public boolean existsDepartmentName(String name) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(String id) {
        if (findById(id) == null) {
            System.err.println("ID không tồn tại!");
        } else {
            departments.remove(findById(id));
        }
    }

    @Override
    public String getNewId() {
        String id = "D";
        int idMax = 0;
        for (Department department : departments) {
            int departmentId = Integer.parseInt(department.getDepartmentId().replace("D", "0"));
            if (idMax < departmentId) {
                idMax = departmentId;
            }
        }
        idMax += 1;
//        String newId = Integer.toString(idMax);
//        if (newId.length() == 1) {
//            id += "0" + 0 + newId;
//        }
//        if (newId.length() == 2) {
//            id += "0" + newId;
//        }
//        if (newId.length() == 3) {
//            id = newId;
//        }
        return "D" + String.format("%03d", idMax);
    }
}
