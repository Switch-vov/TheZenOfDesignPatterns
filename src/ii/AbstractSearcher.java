package ii;
/**
 * 
 * @author test
 * 抽象星探类
 */
public abstract class AbstractSearcher {
	protected IPettyGirl pettyGirl;
	
	public AbstractSearcher(IPettyGirl pettyGirl) {
		this.pettyGirl = pettyGirl;
	}

	public IPettyGirl getPettyGirl() {
		return pettyGirl;
	}

	public void setPettyGirl(IPettyGirl pettyGirl) {
		this.pettyGirl = pettyGirl;
	}
	
	// 列出美女信息
	public abstract void show();
}
