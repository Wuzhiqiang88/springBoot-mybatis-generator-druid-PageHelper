package com.sao.service.impl;

import com.sao.mapper.DepartmentsMapper;
import com.sao.model.Departments;
import com.sao.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Service(value = "departmentsService")
public class DepartmentsServiceImpl implements DepartmentsService{
    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Override
    public List<Departments> findDepartmentsByDepartment(String department) {
        return departmentsMapper.selectDepartmentsByDepartment(department);
    }
}
