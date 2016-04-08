package proxy.common;

/**
 * Created by test on 16/4/8.
 * 普通代理的游戏者
 */
public class GamePlayer implements IGamePlayer{
    private String name = "";

    /**
     * 构造方法限制创建对象者，并传递姓名
     * @param gamePlayer 游戏者
     * @param name 姓名
     * @throws Exception
     */
    public GamePlayer(IGamePlayer gamePlayer, String name) throws  Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = name;
        }
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
