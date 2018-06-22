package com.sao.mapper;

import com.sao.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //这个方式我自己加的
    List<User> selectAllUser();

    User selectByOpenId(String openid);
}