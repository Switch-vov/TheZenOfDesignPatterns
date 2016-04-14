package proxy.dynamic;

/**
 * Created by test on 16/4/14.
 * 前置通知
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置通知，被执行了！");
    }
}
