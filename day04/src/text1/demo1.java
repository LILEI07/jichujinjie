package text1;
/*@ClassName：demo1
@date：2021/10/7 10:37
@作者：李磊
@Version：1.0
@Description：
*/

public class demo1 {
    public static void main(String[] args) {
        useshow(new inter() {
            @Override
            public void show(String ss) {
                System.out.println("匿名内部类中的show方法"+ss);
            }
        });


    useshow((ss)->{System.out.println("lambda表达式的show方法"+ss);});
    }

    public static void useshow(inter inter) {
        inter.show("itheima");
    }
}
interface inter{
    void show(String ss);
}