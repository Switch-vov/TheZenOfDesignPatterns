package builder;

import java.util.ArrayList;

/**
 * Created by test on 16/3/25.
 * 奔驰车组装类
 */
public class BenzBuilder extends CarBuilder{
    /**
     * 宝马车模型
     */
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
