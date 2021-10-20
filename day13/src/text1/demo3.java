package text1;

import java.util.concurrent.*;

/**
 * @ClassName：demo3
 * @Date：2021/10/20
 * @Time: 10:27
 * @Author: 李磊
 * @Version：1.0
 * @Description：
 */

public class demo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        mycallable mycallable = new mycallable();
        FutureTask<String> ft = new FutureTask<>(mycallable);
        Thread t1 = new Thread(ft);
        t1.start();
        System.out.println(ft.get());

    }
}

class mycallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 1000; i++) {
            System.out.println("每天努力敲代码" + i);
        }
        return "恭喜你，加薪了！";
    }
}
