package InterFaceDemo3;
/*@ClassName：demo03
@date：2021/10/6 16:32
@作者：李磊
@Version：1.0
@Description：

*/

public class demo03 {
    public static void main(String[] args) {
        useanimal(new Dog());
        useanimal(new Cat());
    }

    public static void useanimal(animal a) {
        a.eat();
        if (a instanceof Dog) {
            Dog dag = (Dog) a;
            dag.watchhome();
        }
    }
}

abstract class animal {
    public abstract void eat();
}

class Dog extends animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watchhome() {
        System.out.println("看门");
    }
}

class Cat extends animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}