package text6;

import java.io.File;

/**
 * @ClassName：demo
 * @Date：2021/10/17
 * @Time: 21:05
 * @Author: 李磊
 * @Version：1.0
 * @Description： 写一个方法，打印一个文件夹中所有的.java文件
 */

public class demo {
    public static void main(String[] args) {
        File f = new File("E:\\develop\\IdeaProjects\\jichujinjie");
        printJava(f);
    }

    private static void printJava(File f) {
        File[] fs = f.listFiles();
        for (int i = 0; i < fs.length; i++) {
            if (fs[i].isFile()) {
                String name = fs[i].getName();
                String[] sps = name.split("\\.");
                if (sps.length == 2 && "java".equals(sps[1])) {
                    System.out.println(name);
                }
            } else {
                printJava(fs[i]);
            }
        }
    }
}
