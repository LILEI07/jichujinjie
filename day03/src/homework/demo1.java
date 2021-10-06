package homework;
/*@ClassName：demo
@date：2021/10/6 18:25
@作者：李磊
@Version：1.0
@Description：
1. 定义手机类
   行为:
      			打电话,发短信
2. 定义接口IPlay
   行为:
      		玩游戏
3. 定义旧手机类继承手机类
   行为:
      		继承父类的行为
4. 定义新手机继承手机类实现IPlay接口
   行为：
   - 继承父类的行为,重写玩游戏方法
5. 定义测试类
   在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
      	在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法
*/


public class demo1 {
    public static void main(String[] args) {
        usephone(new phone());
        usephone(new newphone());
    }

    public static void usephone(phone p) {
        p.call();
        p.msage();
        if (p instanceof newphone) {
            newphone p0 = (newphone) p;
            p0.playgame();
        }
    }
}

class phone {
    public void call() {
        System.out.println("打电话！");
    }

    public void msage() {
        System.out.println("发短信！");
    }
}

abstract interface IPlay {
    public abstract void playgame();
}

class newphone extends phone implements IPlay {
    @Override
    public void playgame() {
        System.out.println("新手机可以玩游戏！");
    }
}