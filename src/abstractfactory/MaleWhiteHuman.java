package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 白色男性人种类
 */
public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("白种人男性");
    }
}
