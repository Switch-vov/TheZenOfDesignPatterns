package abstractfactory;

/**
 * Created by test on 16/3/18.
 * 抽象黑种人类
 */
public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人讲话");
    }
}
