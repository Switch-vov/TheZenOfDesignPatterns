package model;

/**
 * Created by test on 16/3/25.
 * 哈雷摩托模型类2
 */
public class HumerH2Model extends HumerModel{
    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停止...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎发动...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
