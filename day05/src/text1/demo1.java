package text1;
/*@ClassName：demo1
@date：2021/10/7 16:58
@作者：李磊
@Version：1.0
@Description：
需求：打印10000次，范围是[0,10)的随机数的平方值。并计算这段逻辑需要耗时多久
*/

public class demo1 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int d= (int) (10*Math.random()+10.0);
            System.out.println(Math.pow(d,2));
        }
        long f = System.currentTimeMillis();
        System.out.println(f-l);
    }
}
