package factory.complex;

/**
 * Created by test on 16/3/11.
 * 白种人类
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人类");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
