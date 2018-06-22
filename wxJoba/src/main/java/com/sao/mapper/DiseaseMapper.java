package com.sao.mapper;

import com.sao.model.Disease;
import com.sao.model.DiseaseWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiseaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseWithBLOBs record);

    int insertSelective(DiseaseWithBLOBs record);

    DiseaseWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DiseaseWithBLOBs record);

    int updateByPrimaryKey(Disease record);
    //这个方式我自己加的
    List<Disease> selectAllDisease();
    List<Disease> selectAllDiseaseByKeyWord(String keyWord);
}