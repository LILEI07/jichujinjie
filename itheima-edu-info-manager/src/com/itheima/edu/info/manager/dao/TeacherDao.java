package com.itheima.edu.info.manager.dao;
/*@ClassName：TeacherDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao implements BaseTeacherDao{
    Teacher[] techs = new Teacher[5];


    @Override
    public Teacher[] allTeachers() {
        return techs;
    }

    @Override
    public Boolean addTeacher(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < techs.length; i++) {
            if (techs[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            techs[index] = teacher;
            return true;
        }
    }

    @Override
    public Boolean updateTeacher(Teacher teacher, int result) {
        techs[result] = teacher;
        return true;
    }

    @Override
    public Boolean deleteTeacher(int id) {
        techs[id] = null;
        return true;
    }
}
