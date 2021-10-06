package homework;
/*@ClassName：demo3
@date：2021/10/6 18:26
@作者：李磊
@Version：1.0
@Description：
1. 定义动物类
   属性：
      		年龄，颜色
      		行为:
      			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
      			生成空参有参构造，set和get方法
2. 定义狗类继承动物类
   行为:
      		eat(String something)方法,看家lookHome方法(无参数)
3. 定义猫类继承动物类
   行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
4. 定义Person类
   属性：
      		姓名，年龄
      	行为：
      		keepPet(Dog dog,String something)方法
      			功能：喂养宠物狗，something表示喂养的东西
      	行为：
      		keepPet(Cat cat,String something)方法
      			功能：喂养宠物猫，something表示喂养的东西
      	生成空参有参构造，set和get方法
5. 定义测试类(完成以下打印效果):

   keepPet(Dog dog,String somethind)方法打印内容如下：
   		年龄为30岁的老王养了一只黑颜色的2岁的宠物
   		2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
   keepPet(Cat cat,String somethind)方法打印内容如下：
   	年龄为25岁的老李养了一只灰颜色的3岁的宠物
   	3岁的灰颜色的猫眯着眼睛侧着头吃鱼
*/


public class demo3 {
    public static void main(String[] args) {
        dog1 d = new dog1("2", "黑");
        cat1 c = new cat1("3", "灰");
        Person p1 = new Person("老王", 30);
        Person p2 = new Person("老李", 25);
        p1.keepPet(d, "骨头");
        p2.keepPet(c, "鱼");
    }
}

abstract class animal {
    private String age;
    private String colour;

    public animal() {
    }

    public animal(String age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public abstract void eat(String something);

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

class dog1 extends animal {

    public dog1(String s, String s1) {
        super(s, s1);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃" + something);
    }

    public void lookHome() {
        System.out.println("狗看家！");
    }
}

class cat1 extends animal {

    public cat1(String s, String s1) {
        super(s, s1);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠！");
    }
}

class Person {
    private String name;
    private int age;

    public void keepPet(dog1 dog, String something) {
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + dog.getColour() + "颜色的" + dog.getAge() + "岁的宠物");
        System.out.println(dog.getAge() + "岁的" + dog.getColour() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void keepPet(cat1 cat, String something) {
        System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + cat.getColour() + "颜色的" + cat.getAge() + "岁的宠物");
        System.out.println(cat.getAge() + "岁的" + cat.getColour() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
