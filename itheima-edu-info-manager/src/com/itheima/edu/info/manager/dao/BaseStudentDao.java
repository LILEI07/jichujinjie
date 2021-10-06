package com.itheima.edu.info.manager.dao;
/*@ClassName：StudentDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public interface BaseStudentDao {


    public abstract Boolean addStudent(Student student);

    public abstract Student[] allStudent();

    public abstract boolean deleteStudent(String id);

    public abstract Boolean updateStudent(Student student, int result);
}
