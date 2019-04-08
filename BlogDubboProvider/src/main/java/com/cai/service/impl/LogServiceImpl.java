package com.cai.service.impl;

import com.cai.mapper.LogMapper;
import com.cai.model.Log;
import com.cai.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper logMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return logMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Log record) {
		// TODO Auto-generated method stub
		return logMapper.insert(record);
	}

	@Override
	public int insertSelective(Log record) {
		// TODO Auto-generated method stub
		return logMapper.insert(record);
	}

	@Override
	public Log selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return logMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Log record) {
		// TODO Auto-generated method stub
		return logMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Log record) {
		// TODO Auto-generated method stub
		return logMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Log> selectLogListByDate(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return logMapper.selectLogListByDate(map);
	}

	@Override
	public List<?> selectUserLogByDate(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return logMapper.selectUserLogByDate(map);
	}

}
