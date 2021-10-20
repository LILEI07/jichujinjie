package text3;

import java.awt.*;
import java.io.*;
import java.nio.Buffer;

/**
 * @ClassName：demo3
 * @Date：2021/10/18
 * @Time: 18:22
 * @Author: 李磊
 * @Version：1.0
 * @Description： 使用BufferedReader和BufferedWriter复制文件
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李磊\\Desktop\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\develop\\IdeaProjects\\jichujinjie\\day12\\a.txt"));
        char[] arr = new char[1024];
        int ch;
        while ((ch = br.read(arr)) != -1) {
            bw.write(arr, 0, ch);

        }
        br.close();
        bw.close();
    }
}
