package com.cai.service;

import com.cai.model.Links;

import java.util.List;
import java.util.Map;

public interface LinksService {

	int deleteByPrimaryKey(Integer id);

    int insert(Links record);

    int insertSelective(Links record);
    
    int selectNoApplyLinksCount();
    
    Links selectByPrimaryKeyAdmin(Integer id);
    
    Links selectByPrimaryKey(Integer id);
    
    List<Links> selectAllLinks();
    /**
     * 模糊查询
     * @param map
     * @return
     */
    List<Links> selectLikeLinksListByPage(Map<String, Object> map);
    
    /**
 	 *  获取友链信息，根据状态分组查询
 	 * @return
 	 */
 	List<?>  selectLinksListByStatus();
    
    int updateByPrimaryKeySelective(Links record);

    int updateByPrimaryKey(Links record);
}
