package com.itheima.edu.info.manager.domain;
/*@ClassName：Teacher
@date：2021/9/28 12:32
@作者：李磊
@Version：1.0
@Description：

*/

public class Teacher {
    private String ID;
    private String name;
    private String age;
    private String subject;

    public Teacher() {
    }

    public Teacher(String ID, String name, String age, String subject) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
