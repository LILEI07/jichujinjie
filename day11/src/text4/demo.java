package text4;

import java.io.*;

/**
 * @ClassName：demo
 * @Date：2021/10/17
 * @Time: 20:11
 * @Author: 李磊
 * @Version：1.0
 * @Description： 需求：使用BufferedInputStream和BufferedOutputStream复制图片
 */

public class demo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\李磊\\Pictures\\Eripom^^ - Photos\\'Attractant' ROZOREGALIA GYURIA Preview - 47362020861.jpg"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\李磊\\Desktop\\1.jpg"));

        int a;
        while ((a = in.read()) != -1) {
            out.write(a);
        }
        in.close();
        out.close();
        //视频
        BufferedInputStream in1 = new BufferedInputStream(new FileInputStream("E:\\视频\\双枪李向阳\\双枪李向阳-01.mp4"));
        BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\李磊\\Desktop\\双枪李向阳-01.mp4"));
        int a1;
        while ((a1 = in1.read()) != -1) {
            out1.write(a1);
        }
        in1.close();
        out1.close();

    }

}
