package com.itheima.edu.info.manager.service;
/*@ClassName：StudentService
@date：2021/9/28 12:33
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.factory;

public class StudentService {
    // OtherStudentDao studentDao = new OtherStudentDao();
    BaseStudentDao baseStudentDao = factory.getStudentdao();

    public Boolean addStudent(Student student) {
        return baseStudentDao.addStudent(student);
    }

    public int fandID(String id) {
        Student[] suts = baseStudentDao.allStudent();
        int index = -1;
        for (int i = 0; i < suts.length; i++) {
            if (suts[i] != null && suts[i].getID().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Student[] retrieveStudent() {
        return baseStudentDao.allStudent();
    }

    public boolean deleteStudent(String ID) {
        return baseStudentDao.deleteStudent(ID);
    }


    public Boolean updateStudent(Student student, int result) {
        return baseStudentDao.updateStudent(student, result);
    }
}
