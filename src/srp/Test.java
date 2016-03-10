package srp;
/**
 * 
 * @author test
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		IConnectionManager iConnectionManager = new Phone();
		iConnectionManager.dial("123456");
		IDataTransfer iDataTransfer = (IDataTransfer) iConnectionManager;
		iDataTransfer.dataTransfer(iConnectionManager);
		iConnectionManager.hangup();
	}
}
