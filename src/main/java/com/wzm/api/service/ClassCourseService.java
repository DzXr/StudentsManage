package com.wzm.api.service;

import com.wzm.api.entity.ClassCourse;

import java.util.List;

/**
 * Created by Administrator on 2019/05/10 0010.
 */

public interface ClassCourseService {

    List<ClassCourse> selectByPrimaryKey(String claid);

    int insert(ClassCourse record);

    int deleteByPrimaryKey(String claid, String couid);

}
