package factory.complex;

import factory.example.*;

/**
 * Created by test on 16/3/11.
 * 黑种人工厂类
 */
public class BlackHumanFactory extends AbstractHumanFactory{
    public Human createHuman() {
        return new BlackHuman();
    }
}
