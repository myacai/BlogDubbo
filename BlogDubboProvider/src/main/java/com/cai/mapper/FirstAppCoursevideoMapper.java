package com.cai.mapper;

import com.cai.model.CourseVideo;
import org.apache.ibatis.annotations.Param;

public interface FirstAppCoursevideoMapper {
    CourseVideo getById(@Param(value = "id") int id);
}