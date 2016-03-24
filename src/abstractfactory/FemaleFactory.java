package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 女性人种工厂类
 */
public class FemaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
