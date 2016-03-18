package abstractfactory;

/**
 * Created by test on 16/3/18.
 * 抽象白种人类
 */
public abstract class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白种人皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
