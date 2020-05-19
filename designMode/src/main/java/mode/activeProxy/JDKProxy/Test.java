package mode.activeProxy.JDKProxy;

import mode.activeProxy.JDKProxy.ISinger;
import mode.activeProxy.JDKProxy.Singer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* jdkProxy,jdk动态代理，优点是接口变化了，不需要重新写代理对象
* 缺点是目标对象必须实现接口
* */
public class Test{
    public static void main(String[] args) {
        Singer target = new Singer();
        ISinger proxy  = (ISinger) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("谢谢大家");
                        return returnValue;
                    }
                });
        proxy.sing();
    }
}
