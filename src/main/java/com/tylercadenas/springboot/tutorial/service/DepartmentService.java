package com.tylercadenas.springboot.tutorial.service;

import com.tylercadenas.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartmenmt(Department department); // We created a method to save a given department to the Repository. We'll need to override this in our Implementation class.


    public List<Department> fetchDepartmentList();
}
