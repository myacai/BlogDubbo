package com.cai.service.impl;

import com.cai.mapper.FirstAppCoursevideolistMapper;
import com.cai.model.CourseVideoList;
import com.cai.service.CoursevideolistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursevideolistServiceImpl implements CoursevideolistService {
    @Autowired
    private FirstAppCoursevideolistMapper firstAppCoursevideolistMapper;

    public CourseVideoList getByIndexCourseId(Integer id, Integer v){
        System.out.println("id"+id);
        System.out.println("v"+v);
        return firstAppCoursevideolistMapper.getByIndexCourseId(id,v);
    }

    @Override
    public List<CourseVideoList> getByCourseId(Integer id) {
        return firstAppCoursevideolistMapper.getByCourseId(id);
    }
}
