package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by test on 16/4/14.
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler{
    // 被代理的对象
    private Object target = null;

    // 通过构造方法传递一个对象
    public MyInvocationHandler(Object target){
        this.target = target;
    }

    // 代理方法
    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
