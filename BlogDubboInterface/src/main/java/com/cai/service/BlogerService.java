package com.cai.service;

import com.cai.model.Bloger;


public interface BlogerService {
	
	
	int deleteByPrimaryKey(Integer id);

    
    int insert(Bloger record);

    
    int insertSelective(Bloger record);

    
    Bloger selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(Bloger record);

    
    int updateByPrimaryKey(Bloger record);
    
     Bloger findUserByLoginName(String name);
	
}