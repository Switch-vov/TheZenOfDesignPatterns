package ii;
/**
 * 
 * @author test
 * 美女实现类
 */
public class PettyGirl implements IPettyGirl{
	private String name;
	
	public PettyGirl(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void goodLooking() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---脸蛋漂亮！");
	}

	@Override
	public void niceFigure() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---身材好！");
	}

	@Override
	public void greatTemperament() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "---身材非常棒！");
	}

}
