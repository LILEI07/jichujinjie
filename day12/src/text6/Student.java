package text6;

/**
 * @ClassName：Student
 * @Date：2021/10/18
 * @Time: 21:37
 * @Author: 李磊
 * @Version：1.0
 * @Description： 进行切割，把姓名、年龄、成绩封装为Student对象
 */

public class Student {
    private String name;
    private int age;
    private int achievement;

    public Student() {
    }

    public Student(String name, int age, int achievement) {
        this.name = name;
        this.age = age;
        this.achievement = achievement;
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

    public int getAchievement() {
        return achievement;
    }

    public void setAchievement(int achievement) {
        this.achievement = achievement;
    }
}
