package com.cai.service.impl;

import com.cai.mapper.VisitMapper;
import com.cai.model.Visit;
import com.cai.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VisitServiceImpl implements VisitService {

	@Autowired
	private VisitMapper visitMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return visitMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Visit record) {
		// TODO Auto-generated method stub
		return visitMapper.insert(record);
	}

	@Override
	public int insertSelective(Visit record) {
		// TODO Auto-generated method stub
		return visitMapper.insertSelective(record);
	}

	@Override
	public Visit selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return visitMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Visit record) {
		// TODO Auto-generated method stub
		return visitMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Visit record) {
		// TODO Auto-generated method stub
		return visitMapper.updateByPrimaryKey(record);
	}

	@Override
	public Visit selectVisitByIp(String ip) {
		// TODO Auto-generated method stub
		return visitMapper.selectVisitByIp(ip);
	}

	@Override
	public Long findVisitTimes(Visit visit) {
		// TODO Auto-generated method stub
		return visitMapper.findVisitTimes(visit);
	}

	@Override
	public List<?> selectVisitListByDate(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return visitMapper.selectVisitListByDate(map);
	}


	@Override
	public List<Visit> selectLikeVisitListByPage(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return visitMapper.selectLikeVisitListByPage(map);
	}

	@Override
	public List<?> selectVisitListByIp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return visitMapper.selectVisitListByIp(map);
	}

	@Override
	public List<?> selectLikeVisitListGroupByIp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return visitMapper.selectLikeVisitListGroupByIp(map);
	}

}
