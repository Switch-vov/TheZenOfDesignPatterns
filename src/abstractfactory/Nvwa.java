package abstractfactory;

/**
 * Created by test on 16/3/24.
 * 场景类：女娲造人
 */
public class Nvwa {

    public static void main(String[] args) {
        // 男性产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 女性产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        // 造人

        // 男性
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();

        System.out.println("----男性----");
        System.out.println("----男性黄种人----");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();
        System.out.println("----男性黑种人----");
        maleBlackHuman.getColor();
        maleBlackHuman.getSex();
        maleBlackHuman.talk();
        System.out.println("----男性白种人----");
        maleWhiteHuman.getColor();
        maleWhiteHuman.getSex();
        maleWhiteHuman.talk();

        // 女性
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();

        System.out.println("----女性----");
        System.out.println("----女性黄种人----");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
        System.out.println("----女性黑种人----");
        femaleBlackHuman.getColor();
        femaleBlackHuman.getSex();
        femaleBlackHuman.talk();
        System.out.println("----女性白种人----");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.getSex();
        femaleWhiteHuman.talk();
    }

}
