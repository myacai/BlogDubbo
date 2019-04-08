package com.cai.mapper;

import com.cai.model.Bloger;

public interface BlogerMapper {
    
    int deleteByPrimaryKey(Integer id);

    
    int insert(Bloger record);

    
    int insertSelective(Bloger record);

    
    Bloger selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(Bloger record);

    
    int updateByPrimaryKey(Bloger record);
    
    Bloger findUserByLoginName(String name);
}