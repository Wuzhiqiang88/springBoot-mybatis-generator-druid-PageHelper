package com.sao.mapper;

import com.sao.model.Departments;

import java.util.List;

public interface DepartmentsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
    //这个方式我自己加的
    List<Departments> selectDepartmentsByDepartment(String department);
}