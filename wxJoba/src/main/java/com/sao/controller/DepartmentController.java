package com.sao.controller;

import com.sao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @ResponseBody
    @RequestMapping(value = "/allDepartment", produces = {"application/json;charset=UTF-8"})
    public Object findAllDisease(){
        return departmentService.findAllDepartment();
    }

}
