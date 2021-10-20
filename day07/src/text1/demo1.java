package text1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName：demo1
 * @Date：2021/10/15
 * @Time: 15:57
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class demo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("ff");
        list.add("aa");
        //    diedaiqi(list);迭代器

        //remove方法
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if(it.next().equals("aa")){
                it.remove();
            }
        }
        diedaiqi(list);
    }

    private static void diedaiqi(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
