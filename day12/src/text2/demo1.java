package text2;

import java.io.*;

/**
 * @ClassName：demo
 * @Date：2021/10/18
 * @Time: 18:22
 * @Author: 李磊
 * @Version：1.0
 * @Description： 使用FileReader和FileWriter复制文件
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("C:\\Users\\李磊\\Desktop\\a.txt");
        FileWriter w = new FileWriter("E:\\develop\\IdeaProjects\\jichujinjie\\day12\\a.txt");

        int a;
        // char [] carr=new char[1024*1024];
        while ((a = f.read()) != -1) {
            w.write(a);
        }
        f.close();
        w.close();
    }
}
