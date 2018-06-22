package com.sao.controller;

import com.sao.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Wuzhiqiang on 2018/6/17.
 */
@Controller
@RequestMapping(value = "/departments")
public class DepartmentsController {
    @Autowired
    private DepartmentsService departmentsService;
    @ResponseBody
    @RequestMapping(value = "/allByDepartment", produces = {"application/json;charset=UTF-8"})
    public Object findAllDepartmentsByDepartment(String department){
        return departmentsService.findDepartmentsByDepartment(department);
    }
}
