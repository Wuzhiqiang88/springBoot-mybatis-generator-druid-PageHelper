package com.sao.service;

import com.sao.model.Departments;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
public interface DepartmentsService {
    List<Departments> findDepartmentsByDepartment(String department);
}
