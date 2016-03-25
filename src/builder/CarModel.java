package builder;

import java.util.ArrayList;

/**
 * Created by test on 16/3/25.
 * 车辆模型抽象类
 */
public abstract class CarModel {
    /**
     * 车辆执行顺序
     */
    private ArrayList<String> sequence = new ArrayList<String>();

    /**
     * 启动
     */
    protected abstract void start();

    /**
     * 停止
     */
    protected abstract void stop();

    /**
     * 鸣笛
     */
    protected abstract void alarm();

    /**
     * 发动引擎
     */
    protected abstract void engineBoom();

    /**
     * 运行
     */
    final public void run() {
        // 通过循环判定执行顺序
        for (String s : sequence) {
            if("start".equals(s)) {
                this.start();
            } else if("stop".equals(s)) {
                this.stop();
            } else if("alarm".equals(s)) {
                this.alarm();
            } else if("engine boom".equals(s)) {
                this.engineBoom();
            }
        }
    }

    /**
     * 设置执行顺序
     * @param sequence
     */
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
