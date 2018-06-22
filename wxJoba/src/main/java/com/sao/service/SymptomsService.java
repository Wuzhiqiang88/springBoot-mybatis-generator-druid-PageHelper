package com.sao.service;

import com.sao.model.Symptoms;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
public interface SymptomsService {
    List<Symptoms> findSymptomsByDepartments(String departments);
}
