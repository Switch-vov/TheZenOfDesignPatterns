package proxy.dynamic.example;

/**
 * Created by test on 16/4/8.
 * 动态代理的真实角色
 */
public class GamePlayer implements IGamePlayer {
    // 姓名
    private String name = "";
    // 代理者
    private IGamePlayer proxy = null;

    public  GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为:" + user + "的用户  " + this.name + "登录游戏");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }


}
