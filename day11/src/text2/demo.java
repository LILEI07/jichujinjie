package text2;
import java.io.File;
import java.util.HashMap;

/**
 * @ClassName：demo
 * @Date：2021/10/17
 * @Time: 18:23
 * @Author: 李磊
 * @Version：1.0
 * @Description： 统计文件夹中的文件类型及对应的数量
 */

public class demo {
    public static void main(String[] args) {
        File file = new File("E:\\develop\\IdeaProjects\\jichujinjie");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(file, hm);
        System.out.println(hm);

    }

    private static void getCount(File file, HashMap<String, Integer> hm) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                String[] namearr = name.split("\\.");
                if (namearr.length == 2) {
                    if (hm.containsKey(namearr[1])) {
                        //之前已经存在于map中
                        Integer count = hm.get(namearr[1]);
                        count++;
                        hm.put(namearr[1], count);
                    } else {
                        //该类型第一次出现！
                        hm.put(namearr[1], 1);
                    }
                }
            } else {
                getCount(f, hm);
            }
        }
    }
}
