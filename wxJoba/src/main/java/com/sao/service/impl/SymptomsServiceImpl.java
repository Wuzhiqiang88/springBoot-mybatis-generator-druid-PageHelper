package com.sao.service.impl;

import com.sao.mapper.SymptomsMapper;
import com.sao.model.Symptoms;
import com.sao.service.SymptomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Service(value = "symptomsService")
public class SymptomsServiceImpl implements SymptomsService{
    @Autowired
    private SymptomsMapper symptomsMapper;
    @Override
    public List<Symptoms> findSymptomsByDepartments(String departments) {
        return symptomsMapper.selectSymptomsByDepartments(departments);
    }
}
