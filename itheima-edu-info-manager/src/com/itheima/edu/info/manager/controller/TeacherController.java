package com.itheima.edu.info.manager.controller;
/*@ClassName：TeacherController
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    Scanner sc = new Scanner(System.in);
    TeacherService teacherService = new TeacherService();

    public void start() {

        Scanner sc = new Scanner(System.in);
        int choose2;
        loop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            choose2 = sc.nextInt();
            switch (choose2) {
                case 1:
                    addTeacher();//System.out.println("1.添加老师");
                    break;
                case 2:
                    deleteTeacher();//System.out.println("2.删除老师");
                    break;
                case 3:
                    updateTeacher();//System.out.println("3.修改老师");
                    break;
                case 4:
                    retrieveTeacher();//System.out.println("4.查看老师");
                    break;
                case 5:
                    System.out.println("感谢使用老师管理系统，正在退出...");
                    break loop;
                default:
                    System.out.println("您输入的选择有误，请重新输入！");
                    break;
            }
        }
    }

    private void retrieveTeacher() {
        Teacher[] teachs = teacherService.allTeachers();
        int index = -1;
        for (int i = 0; i < teachs.length; i++) {
            if (teachs[i] == null) {
               continue;
            }
            index++;
        }
        if (index == -1) {
            System.out.println("当前系统还没有老师，请先去添加！");
        } else {
            System.out.println("老师工号\t\t姓名\t\t年龄\t\t授课科目");
            for (int i = 0; i < teachs.length; i++) {
                if (teachs[i] == null) {
                    continue;
                }
                System.out.println(teachs[i].getID() + "\t\t" + teachs[i].getName() + "\t\t" + teachs[i].getAge() + "\t\t" + teachs[i].getSubject());
            }
        }
    }

    private void updateTeacher() {
        String ID;
        int result;//检索的同时记录索引！避免后续进行重复遍历！
        while (true) {
            System.out.println("请输入要修改的老师的教职工号：");
            ID = sc.next();
            result = teacherService.fandTeacherID(ID);
            if (result != -1) {
                System.out.println("* * * *工号验证通过！* * * *");
                break;
            } else {
                System.out.println("* * * *工号不存在，请核对后重新输入！* * * *");
            }
        }
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师年龄:");
        String age = sc.next();
        System.out.println("请输入老师的学科:");
        String subject = sc.next();
        //封装对象
        Teacher teacher = new Teacher(ID, name, age, subject);
        Boolean booolean = teacherService.updateTeacher(teacher, result);
        if (booolean) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private void deleteTeacher() {
        String ID;int result;
        while (true) {
            System.out.println("请输入要删除的老师的工号:");
            ID = sc.next();
            result = teacherService.fandTeacherID(ID);
            if (result != -1) {
                System.out.println("* * * *学号验证通过！* * * *");
                break;
            } else {
                System.out.println("* * * *该工号不存在，请重新输入！* * * *");
            }
        }
        Boolean booolean =teacherService.deleteTeacher(result);
        if (booolean) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    private void addTeacher() {

        String ID;
        while (true) {
            System.out.println("请输入老师的工号:");
            ID = sc.next();
            int result = teacherService.fandTeacherID(ID);
            if (result != -1) {
                System.out.println("* * * *学号已被占用，请重新输入！* * * *");
            } else {
                System.out.println("* * * *学号验证通过！* * * *");
                break;
            }
        }
        System.out.println("请输入老师姓名:");
        String name = sc.next();
        System.out.println("请输入老师年龄:");
        String age = sc.next();
        System.out.println("请输入老师的教学科目:");
        String subject = sc.next();
        //封装对象
        Teacher teacher = new Teacher(ID, name, age, subject);
        //调用方法
        Boolean re = teacherService.addTeacher(teacher);
        if (re) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
