package com.wzm.api.service.impl;

import com.wzm.api.dao.ClassMapper;
import com.wzm.api.entity.Class;
import com.wzm.api.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/05/09 0009.
 */
@Service
public class ClassManageServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;


    @Override
    public List<Class> selectByPrimaryTeaid(String teacherUid, int start, int count) {
        return classMapper.selectByPrimaryTeaid(teacherUid,start,count);
    }

    @Override
    public int insert(Class record) {
        return classMapper.insert(record);
    }

    @Override
    public int getTotalByTeacherUid(String teacherUid) {
        return classMapper.getTotalByTeacherUid(teacherUid);
    }

    @Override
    public Class selectByPrimaryKey(String classUid) {
        return classMapper.selectByPrimaryKey(classUid);
    }

    @Override
    public int updateByPrimaryKeySelective(Class record) {
        return classMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(String classUid) {
        return classMapper.deleteByPrimaryKey(classUid);
    }


}
