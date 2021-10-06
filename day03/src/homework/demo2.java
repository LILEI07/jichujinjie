package homework;
/*@ClassName：demo2
@date：2021/10/6 18:26
@作者：李磊
@Version：1.0
@Description：
1. 定义动物类
   行为:
      			eat方法(无具体行为,不同动物吃的不一样)
2. 定义狗类继承动物类
   行为:
      		eat方法(啃骨头),看家方法
3. 定义猫类继承动物类
   行为:
      		eat方法(吃鱼),抓老鼠方法
4. 测试类:
   定义一个方法,要求该方法既能接收狗对象也能接收猫对象
      	在该方法的内部调用eat()方法,并且调用狗和猫的特有方法
*/


public class demo2 {
    public static void main(String[] args) {
        useanimal(new dog());
        System.out.println("* * * * * * * *");
        useanimal(new cat());
    }

    public static void useanimal(AbstractAnimal a) {
        a.eat();
        if (a instanceof dog) {
            dog d = (dog) a;
            d.lookhome();
        }
        if (a instanceof cat) {
            cat c = (cat) a;
            c.makeMouse();
        }
    }
}

abstract class AbstractAnimal {
    public abstract void eat();
}

class dog extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void lookhome() {
        System.out.println("狗看家");
    }
}

class cat extends AbstractAnimal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void makeMouse() {
        System.out.println("猫捉老鼠");
    }
}