package proxy.dynamic;

/**
 * Created by test on 16/4/14.
 * 真实主题
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("do something---->" + str);
    }
}
