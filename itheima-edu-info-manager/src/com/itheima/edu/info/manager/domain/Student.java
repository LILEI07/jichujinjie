package com.itheima.edu.info.manager.domain;
/*@ClassName：Student
@date：2021/9/28 12:32
@作者：李磊
@Version：1.0
@Description：

*/

public class Student {
    private String ID;
    private String name;
    private String age;
    private String birthday;

    public Student() {
    }

    public Student(String ID, String name, String age, String birthday) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
