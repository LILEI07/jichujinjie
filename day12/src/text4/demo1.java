package text4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName：demo4
 * @Date：2021/10/18
 * @Time: 18:23
 * @Author: 李磊
 * @Version：1.0
 * @Description： 需求：按照下面的要求完成代码
 * - 创建一个a.txt文件，在文件吟诗一首
 * ```java
 * 床前明月光
 * 疑是地上霜
 * 举头望明月
 * 低头思故乡
 * ```
 * - 使用BufferedReader读取a.txt文件，一次读一行，把读取到的每一行存储到ArrayList集合中
 * - 对ArrayList集合进行反转
 * - 提示：自己查询API文档，搜索Collections类，找到reverse(List<?> list) 并使用(这个方法没有讲，相信你会用的^_^）
 * - 把反转后的ArrayList元素，写入b.txt文件中
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\李磊\\Desktop\\b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\develop\\IdeaProjects\\jichujinjie\\day12\\b.txt"));
        ArrayList<String> ss = new ArrayList<>();
        String s0;
        while ((s0 = br.readLine()) != null) {
            ss.add(s0);
        }
        Collections.reverse(ss);
        for (String s : ss) {
            bw.write(s);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
