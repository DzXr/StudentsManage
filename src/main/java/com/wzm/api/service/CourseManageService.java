package com.wzm.api.service;

import com.wzm.api.entity.Course;

import java.util.List;

/**
 * Created by Administrator on 2019/05/10 0010.
 */
public interface CourseManageService {

    Course selectByPrimaryKey(String couid);

    List<Course> selectByPrimarySelective();

    int insert(Course record);

    List<Course> selectByPrimaryCouname(String couname);

}
