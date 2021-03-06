package builder;

/**
 * Created by test on 16/3/25.
 * 奔驰模型
 */
public class BenzModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("奔驰车启动...");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎启动...");
    }
}
