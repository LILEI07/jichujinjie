package com.itheima.edu.info.manager.service;
/*@ClassName：StudentService
@date：2021/9/28 12:33
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public Boolean addStudent(Student student) {

        return studentDao.addStudent(student);
    }

    public int fandID(String id) {
        Student[] suts = studentDao.allStudent();
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
        return studentDao.allStudent();
    }

    public boolean deleteStudent(String ID) {
        return studentDao.deleteStudent(ID);
    }


    public Boolean updateStudent(Student student, int result) {
        return studentDao.updateStudent(student, result);
    }
}
