package text3;

import java.io.*;

/**
 * @ClassName：demo
 * @Date：2021/10/17
 * @Time: 19:07
 * @Author: 李磊
 * @Version：1.0
 * @Description：- 需求：使用FileInputStream和FileOutptuStream复制图片
 * - 代码：
 */

public class demo {
    public static void main(String[] args) throws IOException {
        //复制文件
        //读取文件对象
        FileInputStream in = new FileInputStream("E:\\视频\\双枪李向阳\\双枪李向阳-01.mp4");
        //输出文件对象
        FileOutputStream out = new FileOutputStream("C:\\Users\\李磊\\Desktop\\双枪李向阳-01.mp4");
        int a;
        while ((a = in.read()) != -1) {
            out.write(a);
        }
        in.close();
        out.close();
        //复制图片
        FileInputStream in1 = new FileInputStream("C:\\Users\\李磊\\Pictures\\Eripom^^ - Photos\\'Attractant' ROZOREGALIA GYURIA Preview - 47362020861.jpg");
        FileOutputStream out1 = new FileOutputStream("C:\\Users\\李磊\\Desktop\\1.jpg");
        int a1;
        while ((a1 = in.read()) != -1) {
            out.write(a1);
        }
        in1.close();
        out1.close();
    }
}
