package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 黑色女性人种类
 */
public class FemaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("黑种人女性");
    }
}
