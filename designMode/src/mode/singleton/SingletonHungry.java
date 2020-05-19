package mode.singleton;
/*
* 饿汉式
* */
public class SingletonHungry {
    /*
    * 饿汉式(线程安全，调用效率高，但是不能延时加载)造成资源浪费
    * */
    private static SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return INSTANCE;
    }

}
