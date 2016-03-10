package srp;
/**
 * 
 * @author test
 * 电话实现类
 */
public class Phone implements IConnectionManager,IDataTransfer{

	@Override
	public void dataTransfer(IConnectionManager connectionManager) {
		// TODO Auto-generated method stub
		System.out.println("通话中");
	}

	@Override
	public void dial(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("打电话");
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("挂断电话");
	}
	
}
