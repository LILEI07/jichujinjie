package text1;

/**
 * @ClassName：demo2
 * @Date：2021/10/20
 * @Time: 9:57
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class demo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new runnable());
        Thread t2 = new Thread(new runnable());
        t1.start();
        t2.start();
    }
}

class runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Runnable接口的run方法在执行" + i);
        }
    }
}
