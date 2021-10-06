package InterFaceDemo3;

public interface StactInterFace {
    public default void start() {
        System.out.println("程序启动了");
        log();
    }

    public default void end() {
        System.out.println("程序结束了");
        log();
    }

    private void log() {
        System.out.println("日志启动了");
    }

    private static void staticlog() {
        System.out.println("静态日志启动了");
    }

    public static void staticeat() {
        System.out.println("吃饭");
        staticlog();
    }

    public static void staticdk() {
        System.out.println("喝水");
        staticlog();
    }
}
