package com.itheima.edu.info.manager.controller;
/*@ClassName：StudentController
@date：2021/9/28 12:30
@作者：李磊
@Version：1.0
@Description：

*/

import java.util.Scanner;

public class StudentController {

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choose1 = -1;
        loop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            choose1 = sc.nextInt();
            switch (choose1) {
                case 1:
                    System.out.println(" 1.添加学生");
                    break;
                case 2:
                    System.out.println("2.删除学生");
                    break;
                case 3:
                    System.out.println(" 3.修改学生");
                    break;
                case 4:
                    System.out.println("4.查看学生");
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
