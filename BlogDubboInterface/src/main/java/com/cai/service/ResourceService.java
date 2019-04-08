package com.cai.service;

import com.cai.model.RResource;

import java.util.List;
import java.util.Map;

public interface ResourceService {

	    int deleteByPrimaryKey(Integer id);
	    
	    int insert(RResource record);

	    int insertSelective(RResource record);

	    RResource selectByPrimaryKey(Integer id);

	    /**
	     * 模糊查询
	     * @param map
	     * @return
	     */
	    List<RResource> selectLikeResourceListByPage(Map<String, Object> map);
	    
	    
	    List<?>  selectResourceListByStatus();
	    int updateByPrimaryKeySelective(RResource record);
	    
	    int updateByPrimaryKey(RResource record);
}
