package proxy.common;

/**
 * Created by test on 16/4/8.
 * 游戏者接口
 */
public interface IGamePlayer {
    /**
     * 登录游戏
     * @param user 用户名
     * @param password 密码
     */
    public void login(String user, String password);

    /**
     * 打怪
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();
}