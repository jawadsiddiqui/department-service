package com.jsiddiqui.department.controller;

import com.jsiddiqui.department.entity.Department;
import com.jsiddiqui.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department save(@RequestBody Department department){
        log.info("department-service Method:save");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        return departmentService.findByDepartmentId(departmentId);
    }
}
