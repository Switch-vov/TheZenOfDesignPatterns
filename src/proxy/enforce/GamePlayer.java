package proxy.enforce;

/**
 * Created by test on 16/4/8.
 * 强制代理的真实角色
 */
public class GamePlayer implements IGamePlayer{
    // 姓名
    private String name = "";
    // 代理者
    private IGamePlayer proxy = null;

    public  GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()) {
            System.out.println("登录名为:" + user + "的用户  " + this.name + "登录游戏");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()) {
            System.out.println(this.name + "又升了一级！");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 校验是否是代理访问
     * @return
     */
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
