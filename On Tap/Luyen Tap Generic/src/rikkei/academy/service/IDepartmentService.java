package rikkei.academy.service;

import rikkei.academy.model.Department;

public interface IDepartmentService extends IGenericService<Department, String>{
    String getNewId();

    boolean existsDepartmentName(String name);
}
