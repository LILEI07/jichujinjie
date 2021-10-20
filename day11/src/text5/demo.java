package text5;

import java.io.File;

/**
 * @ClassName：demo
 * @Date：2021/10/17
 * @Time: 20:35
 * @Author: 李磊
 * @Version：1.0
 * @Description： 需求：写一个方法，删除一个有内容文件夹
 * <p>
 * - 写一个方法，求文件夹的大小(了解)
 */

public class demo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\李磊\\Desktop\\葵花宝典 - 副本");
        //获取文件中的所有文件大小，并统计返回
        long size = getSize(file);
        System.out.println(size + "字节");
        //清空文件
        Deletf(file);
    }

    private static long getSize(File f) {
        File[] files = f.listFiles();
        long a = 0;
        long l0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                l0 = files[i].length();
                a = a + l0;
            } else {
                a = a + getSize(files[i]);
            }
        }
        return a;
    }

    private static void Deletf(File f) {
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                files[i].delete();
            } else {
                Deletf(files[i]);
            }
        }
        f.delete();
        return;
    }
}
