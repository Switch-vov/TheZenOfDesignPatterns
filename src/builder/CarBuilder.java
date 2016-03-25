package builder;

import java.util.ArrayList;

/**
 * Created by test on 16/3/25.
 * 抽象汽车组装类
 */
public abstract class CarBuilder {
    /**
     * 设置组装顺序
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 设置完毕后，可以拿到这个车辆模型
     * @return
     */
    public abstract CarModel getCarModel();
}
