package com.sao.service.impl;

import com.github.pagehelper.PageHelper;
import com.sao.mapper.DiseaseMapper;
import com.sao.model.Disease;
import com.sao.model.DiseaseWithBLOBs;
import com.sao.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/16.
 */
@Service(value = "diseaseService")
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private DiseaseMapper diseaseMapper;
    @Override
    public List<Disease> findAllDisease(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return diseaseMapper.selectAllDisease();
    }
    @Override
    public List<Disease> findAllDiseaseByKeyWord(String keyWord, int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return diseaseMapper.selectAllDiseaseByKeyWord(keyWord);
    }

    @Override
    public DiseaseWithBLOBs findById(int id) {
        return diseaseMapper.selectByPrimaryKey(id);
    }
}
