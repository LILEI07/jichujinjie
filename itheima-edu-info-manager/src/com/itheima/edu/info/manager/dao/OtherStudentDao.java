package com.itheima.edu.info.manager.dao;
/*@ClassName：StudentDao
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {


    static ArrayList<Student> arrstus = new ArrayList<>();

    static {
        Student s1 = new Student("heima001", "张三", "23", "2020-01-06");
        Student s2 = new Student("heima002", "李四", "24", "2021-04-04");
        Student s3 = new Student("heima003", "王五", "25", "2020-02-08");
        arrstus.add(s1);
        arrstus.add(s2);
        arrstus.add(s3);

    }

    @Override
    public Boolean addStudent(Student student) {
        arrstus.add(student);
        return true;
    }

    @Override
    public Student[] allStudent() {
        Student[] stus = new Student[arrstus.size()];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = arrstus.get(i);
        }
        return stus;
    }

    @Override
    public boolean deleteStudent(String id) {
        arrstus.remove(id);
        return true;
    }

    @Override
    public Boolean updateStudent(Student student, int result) {
        arrstus.set(result, student);
        return true;
    }
}
