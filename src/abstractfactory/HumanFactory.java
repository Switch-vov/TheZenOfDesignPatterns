package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 人类工厂接口
 */
public interface HumanFactory {
    /**
     * 创建黄种人类
     * @return
     */
    public Human createYellowHuman();

    /**
     * 创建白色人类
     * @return
     */
    public Human createWhiteHuman();

    /**
     * 创建黑色人类
     * @return
     */
    public Human createBlackHuman();
}
