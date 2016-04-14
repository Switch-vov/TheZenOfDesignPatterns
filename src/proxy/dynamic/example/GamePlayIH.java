package proxy.dynamic.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by test on 16/4/14.
 * 动态代理类
 */
public class GamePlayIH implements InvocationHandler{
    // 被代理类实例
    Object obj = null;

    // 代理对象是谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);

        // 有人登陆，则发送消息
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登陆！");
        }

        return result;
    }
}
