package singleton;
/**
 * 
 * @author test
 * 饿汉式
 */
public class Singleton1 {
	private final static Singleton1 singleton1 = new Singleton1();
	// 私有化构造方法
	private Singleton1() {
		
	}
	
	// 获得对象
	public Singleton1 getInstance() {
		return this.singleton1;
	}

	public void print() {
		System.out.println("Singleton1的地址是" + singleton1.toString());
	}

}
