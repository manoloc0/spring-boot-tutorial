package com.tylercadenas.springboot.tutorial.controller;

import com.tylercadenas.springboot.tutorial.entity.Department;
import com.tylercadenas.springboot.tutorial.service.DepartmentService;
import com.tylercadenas.springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired // Autowire the particular object within Spring container to THIS reference we're creating a reference to.
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) { // @RequestBody: Spring says "You'll receive a JSON in the HTTP request body; convert that to a Department object. Spring takes care of everything for you.
        return departmentService.saveDepartmenmt(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long id) {
        return departmentService.fetchDepartmentById(id);
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(id, department);
    }

}
