package proxy.enforce;


/**
 * Created by test on 16/4/8.
 * 强制代理的场景类
 */
public class Client {
    public static void main(String[] args) {

        // 直接访问真实角色
        // 定义一个游戏者
        IGamePlayer player = new GamePlayer("张三");

        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：2016-04-08 11:39:58");
        player.login("zhangsan", "password");
        // 开始打怪
        player.killBoss();
        // 升级
        player.upgrade();
        // 记录结束的游戏时间
        System.out.println("结束时间是：2016-04-08 11:40:17");


        // 直接访问代理类
        // 定义一个游戏者
        IGamePlayer player2 = new GamePlayer("张三");
        // 定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player2);

        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：2016-04-08 11:42:32");
        proxy.login("zhangsan", "password");
        // 开始打怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束的游戏时间
        System.out.println("结束时间是：2016-04-08 11:42:46");


        // 强制代理
        // 定义一个游戏者
        IGamePlayer player3 = new GamePlayer("张三");
        // 获得指定代理
        IGamePlayer proxy2 = player2.getProxy();

        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：2016-04-08 11:45:14");
        proxy2.login("zhangsan", "password");
        // 开始打怪
        proxy2.killBoss();
        // 升级
        proxy2.upgrade();
        // 记录结束的游戏时间
        System.out.println("结束时间是：2016-04-08 11:45:19");

    }
}
