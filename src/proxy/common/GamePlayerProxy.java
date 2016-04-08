package proxy.common;

/**
 * Created by test on 16/4/8.
 * 普通代理的代理者
 */
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;

    /**
     * 通过构造方法传递要对谁进行代练
     * @param name 代理者姓名
     */
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
