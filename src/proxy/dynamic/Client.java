package proxy.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * Created by test on 16/4/14.
 * 动态代理的场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();

        // 定义一个Handeler
        InvocationHandler handler = new MyInvocationHandler(subject);

        // 定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);

        // 行为的代理
        proxy.doSomething("Finish");

    }
}
