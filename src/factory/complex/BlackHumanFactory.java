package factory.complex;

/**
 * Created by test on 16/3/11.
 * 黑种人工厂类
 */
public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> Human createHuman(Class<T> clazz) {
        return null;
    }
}
