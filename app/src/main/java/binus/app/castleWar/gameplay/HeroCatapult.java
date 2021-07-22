package binus.app.castleWar.gameplay;

public class HeroCatapult extends Heroes {
    ArmyCatapult armCat = new ArmyCatapult();
    HeroCatapult heroCat = new HeroCatapult();

    int HERO_LEVEL = Heroes.HERO_LEVEL;

    @Override
    public double attackMultiplayer() {
        power = armCat.HP;
        if (armCat.ArmyType == CAVALRY) {

            power = (power * armCat.numbers) + ((power * armCat.numbers)*(heroCat.numbers* Heroes.CATAPULT_BOOST));
        }
        return power;
    }
}
