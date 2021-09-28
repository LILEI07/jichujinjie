package com.itheima.edu.info.manager.service;
/*@ClassName：TeacherService
@date：2021/9/28 12:33
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {

    TeacherDao teacherDao = new TeacherDao();

    public Boolean updateTeacher(Teacher teacher, int result) {
        return teacherDao.updateTeacher(teacher, result);
    }

    public Teacher[] allTeachers() {
        return teacherDao.allTeachers();
    }

    public int fandTeacherID(String id) {
        Teacher[] techs = allTeachers();
        int index = -1;
        for (int i = 0; i < techs.length; i++) {
            if (techs[i]!=null&&techs[i].getID().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    public Boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }

    public Boolean deleteTeacher(int id) {
        return teacherDao.deleteTeacher(id);
    }
}
