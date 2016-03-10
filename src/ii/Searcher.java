package ii;
/**
 * 
 * @author test
 * 星探类
 */
public class Searcher extends AbstractSearcher {
	public Searcher(IPettyGirl iPettyGirl){
		super(iPettyGirl);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("-----美女信息如下：-----");
		this.pettyGirl.goodLooking();
		this.pettyGirl.niceFigure();
		this.pettyGirl.greatTemperament();
		
	}	
}
