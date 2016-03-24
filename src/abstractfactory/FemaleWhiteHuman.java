package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 白色女性人种类
 */
public class FemaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白种人女性");
    }
}
