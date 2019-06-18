package com.cai.mapper;

import com.cai.model.CourseVideoList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstAppCoursevideolistMapper {
    CourseVideoList getByIndexCourseId(@Param(value = "courseId") Integer id, @Param(value = "courseOrder") Integer v);

    List<CourseVideoList> getByCourseId(@Param(value = "courseId") Integer id);
}