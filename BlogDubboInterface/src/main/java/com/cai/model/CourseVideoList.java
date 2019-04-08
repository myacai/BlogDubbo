package com.cai.model;

public class CourseVideoList {
    private Integer id;
    //课程名字
    private String catalog;

    private Integer courseOrder;

    private String videourl;
    //对应CourseVideo课程类别
    private Integer coursevideoTitleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public Integer getIndex() {
        return courseOrder;
    }

    public void setIndex(Integer courseOrder) {
        this.courseOrder = courseOrder;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public Integer getCoursevideoTitleId() {
        return coursevideoTitleId;
    }

    public void setCoursevideoTitleId(Integer coursevideoTitleId) {
        this.coursevideoTitleId = coursevideoTitleId;
    }
}
