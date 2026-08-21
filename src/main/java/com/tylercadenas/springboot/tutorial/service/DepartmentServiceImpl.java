package com.tylercadenas.springboot.tutorial.service;

import com.tylercadenas.springboot.tutorial.entity.Department;
import com.tylercadenas.springboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // This Autowires the Repository we created in DepartmentRepository using the @Repository annotation

    @Override
    public Department saveDepartmenmt(Department department) { //This is our implementation of the saveDepartment method we said we'ld create in our Department Service interface.
        return departmentRepository.save(department); // Saves the department using the JPA's provided "save" method.
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
