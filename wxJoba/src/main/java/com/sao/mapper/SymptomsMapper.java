package com.sao.mapper;

import com.sao.model.Symptoms;

import java.util.List;

public interface SymptomsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Symptoms record);

    int insertSelective(Symptoms record);

    Symptoms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Symptoms record);

    int updateByPrimaryKey(Symptoms record);
    //这个方式我自己加的
    List<Symptoms> selectSymptomsByDepartments(String departments);
}