package factory.simple;

import factory.example.AbstractHumanFactory;

/**
 * Created by test on 16/3/11.
 * 简单工厂模式
 * 简单人类创建工厂
 */
public class HumanFactory {
    /**
     * 创建人类静态方法
     * @param clazz 人类类对象
     * @param <T> 人类及其子类
     * @return 人类及其子类
     */
    public static <T extends Human> T createHuman(Class<T> clazz) {
        // 定义生产人种
        Human human = null;
        try {
            // 产生一个人种
            human = (T)Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人类生成错误");
            e.printStackTrace();
        }
        return (T) human;
    }
}
