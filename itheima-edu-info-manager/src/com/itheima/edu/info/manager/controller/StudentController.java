package com.itheima.edu.info.manager.controller;
/*@ClassName：StudentController
@date：2021/9/28 12:30
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentService();

    public void start() {

        Scanner sc = new Scanner(System.in);
        int choose1;
        loop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            choose1 = sc.nextInt();
            switch (choose1) {//CRUD分别指增加(Create)、读取查询(Retrieve)、更新(Update)和删除(Delete)
                case 1:
                    addStudent();//System.out.println(" 1.添加学生");
                    break;
                case 2:
                    deleteStudent();//System.out.println("2.删除学生");
                    break;
                case 3:
                    updateStudent();//System.out.println(" 3.修改学生");
                    break;
                case 4:
                    retrieveStudent();//System.out.println("4.查看学生");
                    break;
                case 5:
                    System.out.println("感谢使用学生管理系统，正在退出...");
                    break loop;
                default:
                    System.out.println("您输入的选择有误，请重新输入！");
                    break;
            }
        }
    }

    private void updateStudent() {
        //查看当前所有学生并打印
        boolean isnull = arrIsNull();
        if (isnull) {
            System.out.println("当前系统没有学生，请先去添加");
            return;
        }
        String ID;
        int result;//检索的同时记录索引！避免后续进行重复遍历！
        while (true) {
            System.out.println("请输入要修改的学生的学号：");
            ID = sc.next();
            result = studentService.fandID(ID);
            if (result != -1) {
                System.out.println("* * * *学号验证通过！* * * *");
                break;
            } else {
                System.out.println("* * * *学号不存在，请核对后重新输入！* * * *");
            }
        }
        Student makestudent = makestudent(ID);
        Boolean booolean = studentService.updateStudent(makestudent, result);
        if (booolean) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private void deleteStudent() {
        boolean isnull = arrIsNull();
        if (isnull) {
            System.out.println("当前系统没有学生，请先去添加");
            return;
        }
        String ID;
        while (true) {
            System.out.println("请输入要删除学生的学号：");
            ID = sc.next();
            int result = studentService.fandID(ID);
            if (result != -1) {
                System.out.println("* * * *学号验证通过！* * * *");
                break;
            } else {
                System.out.println("* * * *学号不存在，请核对后重新输入！* * * *");
            }
        }
        boolean result = studentService.deleteStudent(ID);
        if (result) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    private void retrieveStudent() {
        boolean isnull = arrIsNull();
        if (isnull) {
            System.out.println("当前系统没有学生，请先去添加");
            return;
        }
        Student[] stus = studentService.retrieveStudent();
        System.out.println("学号\t\t\t\t姓名\t\t年龄\t\t生日");
        for (Student student : stus) {
            if (student == null) {
                continue;
            }
            System.out.println(student.getID() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getBirthday());
        }
    }

    private void addStudent() {
        String ID;
        while (true) {
            System.out.println("请输入学生ID:");
            ID = sc.next();
            int result = studentService.fandID(ID);
            if (result != -1) {
                System.out.println("* * * *学号已被占用，请重新输入！* * * *");
            } else {
                System.out.println("* * * *学号验证通过！* * * *");
                break;
            }
        }
        Student makestudent = makestudent(ID);
        //调用方法
        Boolean result = studentService.addStudent(makestudent);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private boolean arrIsNull() {
        //查看当前所有学生并打印
        Student[] stus = studentService.retrieveStudent();
        //遍历是否全为空
        int index = -1;
        for (Student student : stus) {
            if (student == null) {
                continue;
            }
            index++;
        }
        //输出结果
        return index == -1;
    }

    private Student makestudent(String id) {
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        String age = sc.next();
        System.out.println("请输入学生生日:");
        String birthday = sc.next();
        //封装对象
        return new Student(id, name, age, birthday);
    }
}
