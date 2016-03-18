package factory.complex;

/**
 * Created by test on 16/3/18.
 * 白种人工厂类
 */
public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
