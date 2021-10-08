package text1;
/*@ClassName：demo4
@date：2021/10/7 14:53
@作者：李磊
@Version：1.0
@Description：

*/

import java.util.Random;

public class demo4 {
    public static void main(String[] args) {
        LambdaInterA interA = System.out::println;
        interA.printMsg("你牛逼吗？");

        LambdaInterB interB = String::split;
        String[] s0 = interB.getStrs("123,45678,78524", ",");
        System.out.println(s0[0]);

        LambdaInterC interC = String::valueOf;
        String s1 = interC.intToStr(25);
        System.out.println(s1);

        LambdaInterD interD = Random::new;
        Random g = interD.getRandom();
        System.out.println(g.nextInt(10) + 1);
    }
}

interface LambdaInterA {
    //打印字符串
    void printMsg(String msg);
}

interface LambdaInterB {
    //根据字符串regular，切割得到字符串数组
    String[] getStrs(String s, String regular);
}

interface LambdaInterC {
    //将int类型数字，转换成字符串返回
    String intToStr(int num);
}

interface LambdaInterD {
    //获取Random对象
    Random getRandom();
}
