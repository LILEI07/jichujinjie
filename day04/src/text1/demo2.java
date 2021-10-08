package text1;
/*@ClassName：demo2
@date：2021/10/7 10:37
@作者：李磊
@Version：1.0
@Description：
*/

import java.util.Random;

public class demo2{
    public static void main(String[] args) {
        usenum(new getradom() {
            @Override
            public int getnum() {
                return new Random().nextInt(10)+1;
            }
        });
        usenum(()->{return new Random().nextInt(10)+1;
        });
    }

    public static void usenum(getradom num) {
        System.out.println(num.getnum());
    }
}
interface getradom{
    int getnum();

}