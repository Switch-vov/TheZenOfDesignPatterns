package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 黄色男性人种类
 */
public class MaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("黄种人男性");
    }
}
