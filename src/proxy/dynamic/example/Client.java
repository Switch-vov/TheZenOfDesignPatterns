package proxy.dynamic.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by test on 16/4/14.
 * 动态代理场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个玩家
        IGamePlayer player = new GamePlayer("张三");

        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(player);

        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：2016-04-14 11:08:38");
        // 获得类的class loader
        ClassLoader classLoader = player.getClass().getClassLoader();
        // 动态产生一个代理类
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, handler);

        // 登陆
        proxy.login("zhangsan", "password");
        // 打怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        System.out.println("结束时间是：2016-04-14 11:11:52");
    }
}
