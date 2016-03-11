package factory.complex;

/**
 * Created by test on 16/3/11.
 * 黑种人类
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话");
    }
}
