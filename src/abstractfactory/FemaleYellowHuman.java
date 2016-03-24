package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 黄色女性人种类
 */
public class FemaleYellowHuman extends AbstractYellowHuman {

    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }
}
