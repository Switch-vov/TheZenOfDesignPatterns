package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 男性人种工厂类
 */
public class MaleFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
