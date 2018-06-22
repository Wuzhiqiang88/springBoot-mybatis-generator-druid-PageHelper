package com.sao.service.impl;

import com.sao.mapper.DepartmentMapper;
import com.sao.model.Department;
import com.sao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }
}
