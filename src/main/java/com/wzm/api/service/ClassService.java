package com.wzm.api.service;

import com.wzm.api.entity.Class;

import java.util.List;

/**
 * Created by Administrator on 2019/05/09 0009.
 */
public interface ClassService {

    List<Class> selectByPrimaryTeaid(String teacherUid, int start, int count);

    int insert(Class record);

    int getTotalByTeacherUid(String teacherUid);

    Class selectByPrimaryKey(String key);

    int updateByPrimaryKeySelective(Class record);

    int deleteByPrimaryKey(String key);


}
