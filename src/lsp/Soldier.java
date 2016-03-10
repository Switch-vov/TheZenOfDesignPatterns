package lsp;
/**
 * 
 * @author test
 * 士兵类
 */
public class Soldier {
	// 枪
	private AbstractGun gun;
	// 设置枪
	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}
	public void killEmemy() {
		System.out.println("士兵杀敌人。。。");
		gun.shoot();
	}
}
