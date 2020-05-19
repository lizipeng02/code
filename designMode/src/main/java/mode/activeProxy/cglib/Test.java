package mode.activeProxy.cglib;

/**
 * 测试类
 */
public class Test{
    public static void main(String[] args){
        //目标对象
        Singer target = new Singer();
        //代理对象
        Singer proxy = (Singer)new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        System.out.println("代理方法执行开始");
        proxy.sing();
        System.out.println("代理方法执行完毕");
    }
}
