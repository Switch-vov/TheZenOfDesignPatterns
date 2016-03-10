package lsp;
/**
 * 
 * @author test
 * 场景类
 */
public class Client {
	public static void main(String[] args) {
		// 士兵
		Soldier soldier = new Soldier();
		// 给枪
		soldier.setGun(new MachineGun());
		// 杀敌
		soldier.killEmemy();
		
		// 狙击手
		Snipper snipper = new Snipper();
		snipper.killEnemy(new AUG());
	}
}
