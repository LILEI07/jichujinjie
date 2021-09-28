package com.itheima.edu.info.manager.controller;
/*@ClassName：TeacherController
@date：2021/9/28 12:31
@作者：李磊
@Version：1.0
@Description：

*/

import java.util.Scanner;

public class TeacherController {
    public void start() {
        Scanner sc = new Scanner(System.in);
        int choose2 = -1;
        loop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            choose2 = sc.nextInt();
            switch (choose2) {
                case 1:
                    System.out.println("1.添加老师");
                    break;
                case 2:
                    System.out.println("2.删除老师");
                    break;
                case 3:
                    System.out.println("3.修改老师");
                    break;
                case 4:
                    System.out.println("4.查看老师");
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
}
