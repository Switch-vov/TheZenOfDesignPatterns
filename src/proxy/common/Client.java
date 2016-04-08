package proxy.common;

/**
 * Created by test on 16/4/8.
 * 普通代理的场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");

        // 带游戏，记录时间戳
        System.out.println("开始时间是：2016-04-08 11:14:15");
        proxy.login("zhangsan", "password");
        // 开始打怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束的游戏时间
        System.out.println("结束时间是：2016-04-08 11:15:38");
    }
}
