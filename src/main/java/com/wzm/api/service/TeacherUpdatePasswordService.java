package com.wzm.api.service;



/**
 * Created by Administrator on 2019/05/08 0008.
 */
public interface TeacherUpdatePasswordService {

     boolean updatePassword(String teacherUid, String password, String newPassword, String reNewPassword);


}
