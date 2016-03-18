package factory.complex;

/**
 * Created by test on 16/3/18.
 * 黄种人工厂类
 */
public class YellowHumanFactory extends AbstractHumanFactory{

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
