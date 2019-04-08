package com.cai.service;

import com.cai.model.CourseVideoList;

import java.util.List;

public interface CoursevideolistService {
    CourseVideoList getByIndexCourseId(Integer id, Integer v);
    List<CourseVideoList> getByCourseId(Integer id);
}
