package model;

/**
 * Created by test on 16/3/25.
 * 抽象哈雷摩托模型类
 */
public abstract class HumerModel{
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


    public final void run() {
        // 启动
        this.start();
        // 发动引擎
        this.engineBoom();
        // 是否鸣笛
        if(this.isAlarm()) {
            // 鸣笛
            this.alarm();
        }
        // 停止
        this.stop();
    }

    /**
     * 是否鸣笛,默认鸣笛。钩子方法
     */
    protected boolean isAlarm() {
        return true;
    }
}
