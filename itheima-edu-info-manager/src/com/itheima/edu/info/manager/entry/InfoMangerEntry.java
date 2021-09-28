package com.itheima.edu.info.manager.entry;
/*@ClassName：InfoMangerEntry
@date：2021/9/28 12:29
@作者：李磊
@Version：1.0
@Description：

*/

import com.itheima.edu.info.manager.controller.StudentController;
import com.itheima.edu.info.manager.controller.TeacherController;

import java.util.Scanner;

public class InfoMangerEntry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choose0=-1;
        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            choose0=sc.nextInt();
            switch (choose0){
                case 1:
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case 2:
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case 3:
                    System.out.println("谢谢使用信息管理系统，正在退出...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您输入的选择有误，请重新输入！");
                    break;
            }
        }


    }
}
