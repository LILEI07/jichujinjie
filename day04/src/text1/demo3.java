package text1;
/*@ClassName：demo3
@date：2021/10/7 14:21
@作者：李磊
@Version：1.0
@Description：

*/

public class demo3 {
    public static void main(String[] args) {
        usenum(new clac() {
            @Override
            public int addnum(int a, int b) {
                return a+b;
            }
        });
        usenum((int a,int b)->{return a+b;});
    }

    public static void usenum(clac clac) {
        System.out.println(clac.addnum(10, 35));
    }
}
interface clac{
    int addnum(int a,int b);
}
