package text3;
/*@ClassName：demo3
@date：2021/10/8 10:21
@作者：李磊
@Version：1.0
@Description：

*/

import java.math.BigDecimal;

public class demo3 {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("0.8");
        BigDecimal b2=new BigDecimal("0.3");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
    }
}
