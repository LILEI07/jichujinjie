package text02;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

/**
 * @ClassName：demo
 * @Date：2021/10/14
 * @Time: 21:12
 * @Author: 李磊
 * @Version：1.0
 * @Description： 1.创建一个员工类Employee，有姓名name、年龄age、工资salary属性
 * 2.创建3个员工对象，添加到TreeSet集合中
 * 3.要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序；
 */

public class demo {
    public static void main(String[] args) {
        Employee e1 = new Employee("xiaoheia", 20, 2000);
        Employee e2 = new Employee("xiaoheic", 21, 2000);
        Employee e3 = new Employee("xiaoheib", 21, 2000);

        TreeSet<Object> set0 = new TreeSet<>();
        set0.add(e1);
        set0.add(e2);
        set0.add(e3);
        System.out.println(set0);
    }
}
