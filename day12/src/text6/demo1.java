package text6;

import java.io.*;
import java.util.ArrayList;

/**
 * @ClassName：demo6
 * @Date：2021/10/18
 * @Time: 18:24
 * @Author: 李磊
 * @Version：1.0
 * @Description： 需求：按要求完成下面的需求
 *
 * - 准备一个stu.txt文件，每一行表示一个学生的信息(包含姓名,年龄,成绩)，如下：
 *
 *
 * 张三,20,100
 * 李四,30,80
 * 王五,40,99
 *
 *
 * - 使用BufferedReader读取每一行，并使用","进行切割，把姓名、年龄、成绩封装为Student对象
 * - 把Student对象，存储到ArrayList集合中
 * - 使用Stream流的方法，对集合中的元素按照成绩排序，再收集成List集合
 * - 再把集合排序后的学生信息，使用BufferedWriter写入到b.txt文件中
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\develop\\IdeaProjects\\jichujinjie\\day12\\stu.txt"));
   String p;
        ArrayList <Student> arr=new ArrayList<>();
   while ((p=br.readLine())!=null){
       String[] ss = p.split(",");
   //    arr.add(new Student(ss[0]),Integer.parseInt(ss[1]),Integer.parseInt(ss[2]));


   }

    }
}
