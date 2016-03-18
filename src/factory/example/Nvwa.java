package factory.example;

/**
 * Created by test on 16/3/11.
 * 女娲类
 */
public class Nvwa {
    public static void main(String[] args) {
        // 八卦炉
        AbstractHumanFactory yingYangLu = new HumanFactory();
        // 白种人
        System.out.println("---白种人---");
        Human whiteHuman = yingYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 黑种类
        System.out.println("---黑种人---");
        Human blackHuman = yingYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 黄种人
        System.out.println("---黄种人---");
        Human yellowHuman = yingYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
