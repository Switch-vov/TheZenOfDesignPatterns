package factory.example;

/**
 * Created by test on 16/3/11.
 * 人类创建工厂
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
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
