package factory.simple;

/**
 * Created by test on 16/3/11.
 * 黄种人类
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
