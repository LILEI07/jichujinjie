package text02;

import java.util.Comparator;

/**
 * @ClassName：Employee
 * @Date：2021/10/14
 * @Time: 21:12
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class Employee implements Comparable<Employee> {
    //1.创建一个员工类Employee，有姓名name、年龄age、工资salary属性
    private String name;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');

        return sb.toString();
    }

    //如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；
    @Override
    public int compareTo(Employee o) {
        int result = this.salary - o.salary;
        result = result == 0 ? this.age - o.age : result;
        result = result == 0 ? this.name.compareTo(o.getName()) : result;

        return result;
    }
}
