package builder;

/**
 * Created by test on 16/4/7.
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.getABenzModel().run();
        System.out.println("-----------------");
        director.getABenzModel().run();
        System.out.println("-----------------");
        director.getCBMWModel().run();
        System.out.println("-----------------");
        director.getDBMWModel().run();
    }

}
