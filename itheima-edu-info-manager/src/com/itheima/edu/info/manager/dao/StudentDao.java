package com.itheima.edu.info.manager.dao;
/*@ClassName：StudentDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {

    Student[] stus = new Student[5];

    public Boolean addStudent(Student student) {

        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stus[index] = student;
            return true;
        }
    }

    public Student[] allStudent() {

        return stus;
    }

    public boolean deleteStudent(String id) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].getID().equals(id)) {
                stus[i] = null;
                break;
            }
        }
        return true;
    }

    public Boolean updateStudent(Student student, int result) {
        stus[result] = student;
        return true;
    }
}
