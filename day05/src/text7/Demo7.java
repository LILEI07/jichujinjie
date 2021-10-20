package text7;

/**
 * @ClassName：demo7
 * @Date：2021/10/8
 * @Time: 15:27
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class Demo7 {
    public static void main(String[] args) {
        System.out.println(getJc(10));
    }

    private static int getJc(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * getJc(i - 1);
        }
    }
}
