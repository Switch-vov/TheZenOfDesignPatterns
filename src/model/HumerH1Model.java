package model;

/**
 * Created by test on 16/3/25.
 * 哈雷摩托模型类1
 */
public class HumerH1Model extends HumerModel{
    // 是否鸣笛标志
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎发动...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
