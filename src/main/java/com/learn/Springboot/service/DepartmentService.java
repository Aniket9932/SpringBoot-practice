package com.learn.Springboot.service;

import com.learn.Springboot.entity.Department;
import com.learn.Springboot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
