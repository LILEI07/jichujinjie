package text1;

/**
 * @ClassName：demo1
 * @Date：2021/10/20
 * @Time: 9:41
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class demo1 {
    public static void main(String[] args) {
        System.out.println("360软件启动了");
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();

        t1.start();
        t2.start();
        System.out.println("程序运行的很辛苦！");
    }
}

class mythread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("360杀毒扫描正在进行" + i);
        }
    }
}

class mythread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("360体检正在进行" + i);
        }
    }
}