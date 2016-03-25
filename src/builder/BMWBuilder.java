package builder;

import java.util.ArrayList;

/**
 * Created by test on 16/3/25.
 * 宝马车组装类
 */
public class BMWBuilder extends CarBuilder{
    /**
     * 宝马车模型
     */
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmw;
    }
}
