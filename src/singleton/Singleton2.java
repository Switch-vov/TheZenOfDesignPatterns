package singleton;
/**
 * 
 * @author test
 * 懒汉式
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    public static class singleton{
        public static Singleton2 singleton = new Singleton2();
    }

    public static Singleton2 getInstance() {
        if(singleton2 == null) {
            singleton2 = singleton.singleton;
        }
        return singleton2;
    }

    public void print() {
        System.out.println("Singleton2的地址是" + singleton2.toString());
    }
}
