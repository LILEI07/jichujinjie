package text5;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName：demo5
 * @Date：2021/10/18
 * @Time: 18:23
 * @Author: 李磊
 * @Version：1.0
 * @Description： 使用Properties和配置文件，完成软件只能运行三次的案例
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\develop\\IdeaProjects\\jichujinjie\\aa.properties");
        int p = -1;
        if (!f.exists()) {
            f.createNewFile();
            p = 1;
        }
        Properties po = new Properties();
        if (p == 1) {
            FileWriter fw0 = new FileWriter("E:\\develop\\IdeaProjects\\jichujinjie\\aa.properties");
            po.setProperty("count", String.valueOf(0));
            po.store(fw0, null);
            fw0.close();
        }
        FileReader fr = new FileReader("E:\\develop\\IdeaProjects\\jichujinjie\\aa.properties");
        po.load(fr);
        String countstr = po.getProperty("count");
        int i = Integer.parseInt(countstr);
        FileWriter fw1 = new FileWriter("E:\\develop\\IdeaProjects\\jichujinjie\\aa.properties");
        if (i < 3) {
            System.out.println("欢迎来到王者荣耀！");
            System.out.println("敌方还有五秒钟到达战场");
            System.out.println("碾碎他们！");
            System.out.println("………………");
            System.out.println("游戏结束，欢迎下次再来！");
            System.out.println("您还有"+(2-i)+"次试用机会");
            i++;
            po.setProperty("count", String.valueOf(i));
            po.store(fw1, null);
        } else {
            System.out.println("三次体验已经用完，请激活软件！");
        }

        fw1.close();
        fr.close();
    }
}
