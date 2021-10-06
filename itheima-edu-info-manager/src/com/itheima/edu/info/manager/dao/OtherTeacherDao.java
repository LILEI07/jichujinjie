package com.itheima.edu.info.manager.dao;
/*@ClassName：TeacherDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Teacher;

import java.util.ArrayList;

public class OtherTeacherDao {
  
    static ArrayList<Teacher> arrtechs = new ArrayList<>();

    static {
        Teacher t1 = new Teacher("heima001", "张三", "24", "2020-01-26");
        Teacher t2 = new Teacher("heima002", "李四", "25", "1995-07-12");
        Teacher t3 = new Teacher("heima003", "王五", "23", "1986-05-08");
        arrtechs.add(t1);
        arrtechs.add(t2);
        arrtechs.add(t3);
    }

    public Teacher[] allTeachers() {
        Teacher[] techs = new Teacher[arrtechs.size()];
        for (int i = 0; i < techs.length; i++) {
            techs[i] = arrtechs.get(i);

        }
        return techs;
    }

    public Boolean addTeacher(Teacher teacher) {
        arrtechs.add(teacher);
        return true;
    }

    public Boolean updateTeacher(Teacher teacher, int result) {
        arrtechs.set(result, teacher);
        return true;
    }

    public Boolean deleteTeacher(int id) {
        arrtechs.remove(id);
        return true;
    }
}
