package mode.singleton;


public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    /*
     * 懒汉模式线程不安全，必须方法同步，同步后调用效率低，但却可以延迟加载
     * */
    public static synchronized SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    /*
     * 双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）
     * */
    public static SingletonLazy getInstance1() {
        //多线程并发时可能同时存在判断满足条件
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }

    /*
     * 静态内部类实现模式（线程安全，调用效率高，可以延时加载）
     * */
    private static class SingletonClassInstance {
        private static final SingletonLazy INSTANCEC = new SingletonLazy();
    }

    public static SingletonLazy getInstance2() {
        return SingletonClassInstance.INSTANCEC;
    }


    public enum SingletonLazyEnum {
        INSTANCE;
        int i = 0;
        void doSomeThing() {
            System.out.println("初始化" + i++);
        }

        }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                SingletonLazyEnum.INSTANCE.doSomeThing();
            }).start();
        }
    }
}
