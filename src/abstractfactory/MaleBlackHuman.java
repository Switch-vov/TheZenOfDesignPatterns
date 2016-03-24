package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 黑色男性人种类
 */
public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("黑种人男性");
    }
}
