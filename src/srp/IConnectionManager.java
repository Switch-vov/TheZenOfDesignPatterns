package srp;
/**
 * 
 * @author test
 * 管理连接接口
 */
public interface IConnectionManager {
	public void dial(String phoneNumber);
	public void hangup();
}
