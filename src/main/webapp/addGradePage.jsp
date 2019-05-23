<<<<<<< HEAD
﻿<%@ page import="com.wzm.api.entity.ClassCourse" %>
=======
<%@ page import="com.wzm.api.entity.ClassCourse" %>
>>>>>>> origin/master
<%@ page import="java.util.List" %>
<%@ page import="com.wzm.api.entity.Course" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/6 0006
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<<<<<<< HEAD
 <head>
    <title>addGradePage</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="searchCla.css">
</head>
<body>
                <div class="target">
                        <div class="target-1">     
                                <select name="" id="select-nav" onchange="window.location=this.value;">
                                    <option value="main.html">首页</option>
                                    <option value="main.html">首页</option>
                                    <option value="clamanage.do">班级管理</option>
                                    <option value="login.html">退出登录</option>
                                </select>
                                    </div>
                  <div class="target-2">学生信息管理系统</div>
                 
                <div class="target-3">
                        <table border=1>
                                <form action="addGrade.do" method="post">
=======
<head>
    <title>addGradePage</title>
</head>
<body>
<h1>学生信息管理系统</h1>
<div style='align:center;background-color:#eeeeee'>
    <sup>·+·+</sup><a href='main.html'>首页</a><sup>·+·+</sup><a href='clamanage.do'>班级管理</a><sup>·+·+</sup><a href='login.html'>退出登录</a><sup>·+·+</sup><br>
    <table border=1>
        <div align ="center" style="text-align:center;background-color:#eeeeee">
            <form action="addGrade.do" method="post">
>>>>>>> origin/master
                <%
                    List<ClassCourse> classCoursesList = (List)request.getAttribute("classCoursesList");
                    List<Course> courseList = (List)request.getAttribute("courseList");
                    char text = 'a';
                    int index = 0;
                    for (ClassCourse b : classCoursesList) {
                        text = (char) (text + 1);
                        String coursename = courseList.get(index).getCouname();
                %>
                        <p><%=coursename %> :<input type="text" name="<%=text %>"/></p>
                    <%

                        index++;
                    }
                    %>
<<<<<<< HEAD
                <input type="submit" value="提交" style="width: 80px;height: 30px;border-radius: 8px;opacity: 0.8;font-size:19px; cursor: pointer; outline:none;"/>
                                    </form>
                        </table>               
                </div>
                <div>
                        <marquee behavior="alternate">
                            <span style="color:red; font-size:18px;font-weight:bold;">欢迎来到学生信息管理系统</span>
                            </marquee></div>
                            </div>
        </body>
        </html>
=======
                <input type="submit" value="提交"/>
            </form>
        </div>
    </table>
</div>

</body>
</html>
>>>>>>> origin/master
