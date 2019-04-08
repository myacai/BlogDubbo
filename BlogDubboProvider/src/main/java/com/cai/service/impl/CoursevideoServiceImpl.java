package com.cai.service.impl;

import com.cai.mapper.FirstAppCoursevideoMapper;
import com.cai.model.CourseVideo;
import com.cai.service.CoursevideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursevideoServiceImpl implements CoursevideoService {
    @Autowired
    private FirstAppCoursevideoMapper firstAppCoursevideoMapper;

    @Override
    public CourseVideo getById(int id) {

        return firstAppCoursevideoMapper.getById(id);
    }
}
