package com.itheima.edu.info.manager.dao;
/*@ClassName：TeacherDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Teacher;

import java.util.ArrayList;

public interface BaseTeacherDao {

    public abstract Teacher[] allTeachers() ;

    public abstract Boolean addTeacher(Teacher teacher);

    public abstract Boolean updateTeacher(Teacher teacher, int result);

    public abstract Boolean deleteTeacher(int id);
}
