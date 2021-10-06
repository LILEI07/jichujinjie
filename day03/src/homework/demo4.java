package homework;
/*@ClassName：demo4
@date：2021/10/6 18:26
@作者：李磊
@Version：1.0
@Description：
1. 定义动物类：
   行为：Roar
      			吼叫；没有具体的吼叫行为
      			吃饭:没有具体的吃饭行为
2. 定义缉毒接口
   行为:
      			缉毒
3. 定义缉毒狗:犬的一种
   行为：
      			吼叫:汪汪叫
      			吃饭:狗啃骨头
      			缉毒:用鼻子侦测毒
4. 定义测试类:
   使用多态的形式创建缉毒狗对象,调用缉毒方法和吼叫方法
*/
public class demo4 {
    public static void main(String[] args) {
        animal2 a2 = new dag2();
        a2.roar();
        dag2 d2 = (dag2) a2;
        d2.antiDrug();
    }
}

abstract class animal2 {
    public abstract void roar();

    public abstract void eat();
}

interface drug {
    public void antiDrug();
}

class dag2 extends animal2 implements drug {
    @Override
    public void roar() {
        System.out.println("汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void antiDrug() {
        System.out.println("用鼻子侦测毒");
    }
}
