package text1;
/*@ClassName：demo
@date：2021/10/7 9:30
@作者：李磊
@Version：1.0
@Description：

*/

public class demo {
    public static void main(String[] args) {

    }
}
class myclac{
    class i1 extends inter1{}
    class i2 extends inter2{}


}


class inter1{
    int q=10;
    public void pl(){
        System.out.println(q);
    }
    public double add(double a,double b){
       return a+b;
    }
}

class inter2{
    public  double pow(double a,int b){
        double sum=1;
        for (int i = 0; i < b; i++) {
            sum=sum*a;
        }
        return sum;
    }
}
