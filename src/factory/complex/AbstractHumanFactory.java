package factory.complex;

/**
 * Created by test on 16/3/11.
 * 复杂工厂类，每个人种都要有实现工厂
 * 抽象人类创建工厂类
 */
public abstract class AbstractHumanFactory {
    /**
     * 创建人类方法
     * @param <T> 人类及其子类
     * @param clazz 人类类对象
     * @return 人类及其子类
     */
    public abstract <T extends Human> Human createHuman(Class<T> clazz);
}
