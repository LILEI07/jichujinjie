package InterFaceDemo2;

public interface Function {
    void card();

    default void scan() {
        System.out.println("扫一扫，没钱了！");
    }

    //骑车方法
    default void cycling() {
        System.out.println("骑车出行");
    }
}
