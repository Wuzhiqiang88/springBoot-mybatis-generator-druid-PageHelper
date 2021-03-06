package com.sao.controller;

import com.sao.service.SymptomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Controller
@RequestMapping(value = "/symptoms")
public class Symptoms {
    @Autowired
    private SymptomsService symptomsService;
    @ResponseBody
    @RequestMapping(value = "/allByDepartments", produces = {"application/json;charset=UTF-8"})
    public Object findAllSymptomsByDepartments(String departments){
        return symptomsService.findSymptomsByDepartments(departments);
    }
}
