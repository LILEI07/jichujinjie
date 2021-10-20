package text2;

import java.util.ArrayList;

/**
 * @ClassName：demo2
 * @Date：2021/10/15
 * @Time: 16:10
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class demo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("ff");
        list.add("aa");

        for (String s:list){
            System.out.println(s);
        }
    }
}
