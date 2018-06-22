package com.sao.controller;

import com.sao.model.Disease;
import com.sao.model.DiseaseWithBLOBs;
import com.sao.service.DiseaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Wuzhiqiang on 2018/6/16.
 */
@Controller
@RequestMapping(value = "/disease")
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public Object findAllDisease( int pageNum,  int pageSize){
        return diseaseService.findAllDisease(pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/allByKeyWord", produces = {"application/json;charset=UTF-8"})
    public Object findAllDiseaseByKeyWord(String keyWord, int pageNum, int pageSize){
        return diseaseService.findAllDiseaseByKeyWord(keyWord,pageNum,pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/getDiseaseById", produces = {"application/json;charset=UTF-8"})
    public Object getDiseaseById(int id){
        return diseaseService.findById(id);
    }
}
