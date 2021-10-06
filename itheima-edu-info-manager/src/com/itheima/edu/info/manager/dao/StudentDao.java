package com.itheima.edu.info.manager.dao;
/*@ClassName：StudentDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao implements BaseStudentDao {

    static Student[] stus = new Student[5];

    static {
        Student s1 = new Student("heima001", "张三", "23", "2020-01-06");
        Student s2 = new Student("heima002", "李四", "24", "2021-04-04");
        Student s3 = new Student("heima003", "王五", "25", "2020-02-08");
        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;
    }

    @Override
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

    @Override
    public Student[] allStudent() {

        return stus;
    }

    @Override
    public boolean deleteStudent(String id) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].getID().equals(id)) {
                stus[i] = null;
                break;
            }
        }
        return true;
    }

    @Override
    public Boolean updateStudent(Student student, int result) {
        stus[result] = student;
        return true;
    }
}
