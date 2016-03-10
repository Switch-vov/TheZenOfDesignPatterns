package singleton;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			Singleton1 singleton1 = Singleton1.getInstance();

			singleton1.print();


		}

		for (int i = 0; i < 5; i++) {
			Singleton2 singleton2 = Singleton2.getInstance();
			singleton2.print();
		}
	}

}
