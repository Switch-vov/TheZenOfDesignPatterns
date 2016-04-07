package builder;

import java.util.ArrayList;

/**
 * Created by test on 16/3/25.
 * 导演类
 */
public class Director {
    /**
     * 执行顺序
     */
    private ArrayList<String> sequence = new ArrayList<String>();
    /**
     * 奔驰建造对象
     */
    private BenzBuilder benzBuilder = new BenzBuilder();
    /**
     * 宝马建造对象
     */
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型奔驰模型，先start,然后stop
     * @return
     */
    public BenzModel getABenzModel() {
        // 清理场景
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    /**
     * 这里还可以添加多个通过建造者获取模型的方法
     */

}
