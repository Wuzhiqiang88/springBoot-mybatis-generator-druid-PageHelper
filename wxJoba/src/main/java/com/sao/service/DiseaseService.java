package com.sao.service;

import com.sao.model.Disease;
import com.sao.model.DiseaseWithBLOBs;

import java.util.List;

/**
 * Created by Wuzhiqiang on 2018/6/16.
 */
public interface DiseaseService {
    List<Disease> findAllDisease(int pageNum, int pageSize);
    List<Disease> findAllDiseaseByKeyWord(String keyWord, int pageNum, int pageSize);
    DiseaseWithBLOBs findById(int id);
}
