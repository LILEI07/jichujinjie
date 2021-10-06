package InterFaceDemo1;
/*@ClassName：demo
@date：2021/10/6 10:55
@作者：李磊
@Version：1.0
@Description：
//练习一：
//1.使用接口的格式创建两个接口，分别是Inter1和Inter2
//2.分在两个接口中各自定义一个方法，分别是study()和print()方法
//3.在测试类TestInterface中，创建接口Inter1的对象，看代码是否有问题
//4.创建一个类InterImpl,实现Inter1接口
//5.在测试类TestInterface中，测试实现类的方法使用
//6.让InterImpl继续实现Inter2接口，查看代码是否有问题
//7.在测试类中测试InterImpl的方法使用
//8.如果既想让InterImpl实现接口Inter2，又不想重写Inter2的抽象方法，该如何处理？
*/

public class InterImpl implements Inter1, Inter2 {

    @Override
    public void study() {
        System.out.println("我是实现类的学习方法");
    }

    @Override
    public void print() {
        System.out.println("我是实现类的打印方法");
    }
}
