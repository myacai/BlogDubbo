package com.cai.service.impl;

import com.cai.mapper.LinksMapper;
import com.cai.model.Links;
import com.cai.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LinksServiceImpl implements LinksService {

	@Autowired
	private LinksMapper linksMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return linksMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Links record) {
		// TODO Auto-generated method stub
		return linksMapper.insert(record);
	}

	@Override
	public int insertSelective(Links record) {
		// TODO Auto-generated method stub
		return linksMapper.insertSelective(record);
	}
	
	@Override
	public Links selectByPrimaryKeyAdmin(Integer id){
		
		return linksMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public Links selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		Links links=linksMapper.selectByPrimaryKey(id);
		if(links!=null){
			links.setClicknum(links.getClicknum()+1);
			linksMapper.updateByPrimaryKeySelective(links);
		}
		return links;
	}

	@Override
	public List<Links> selectLikeLinksListByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return linksMapper.selectLikeLinksListByPage(map);
	}

	@Override
	public List<?> selectLinksListByStatus() {
		// TODO Auto-generated method stub
		return linksMapper.selectLinksListByStatus();
	}

	@Override
	public int updateByPrimaryKeySelective(Links record) {
		// TODO Auto-generated method stub
		return linksMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Links record) {
		// TODO Auto-generated method stub
		return linksMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Links> selectAllLinks() {
		// TODO Auto-generated method stub
		return linksMapper.selectAllLinks();
	}

	@Override
	public int selectNoApplyLinksCount() {
		// TODO Auto-generated method stub
		return linksMapper.selectNoApplyLinksCount();
	}

}
