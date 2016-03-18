package factory.complex;

import factory.example.HumanFactory;

/**
 * Created by test on 16/3/11.
 * 女娲类
 */
public class Nvwa {
    public static void main(String[] args) {
        // 白种人
        System.out.println("---白种人---");
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        // 黑种类
        System.out.println("---黑种人---");
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        // 黄种人
        System.out.println("---黄种人---");
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
