package com.jsiddiqui.department.service;

import com.jsiddiqui.department.entity.Department;
import com.jsiddiqui.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
