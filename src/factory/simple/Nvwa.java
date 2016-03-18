package factory.simple;

import factory.example.AbstractHumanFactory;

/**
 * Created by test on 16/3/11.
 * 女娲类
 */
public class Nvwa {
    public static void main(String[] args) {
        // 白种人
        System.out.println("---白种人---");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        // 黑种类
        System.out.println("---黑种人---");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        // 黄种人
        System.out.println("---黄种人---");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
