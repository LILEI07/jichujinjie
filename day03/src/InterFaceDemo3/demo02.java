package InterFaceDemo3;
/*@ClassName：demo02
@date：2021/10/6 15:39
@作者：李磊
@Version：1.0
@Description：

*/

public class demo02 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.age);

        f.eat();

    }
}

class Fu {
    int age = 40;

    public void eat() {
        System.out.println("吃饭");
    }
}

class Zi extends Fu {
    int age = 10;

    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}