package binus.app.castleWar.gameplay;

public class HeroInfantry extends Heroes {
    ArmyInfantry armInf = new ArmyInfantry();
    HeroInfantry heroInf = new HeroInfantry();

    int HERO_LEVEL = Heroes.HERO_LEVEL;

    @Override
    public double attackMultiplayer() {
        power = armInf.HP;
        if (armInf.ArmyType == INFANTRY) {

            power = (power * armInf.numbers) + ((power * armInf.numbers)*(heroInf.numbers* Heroes.INFANTRY_BOOST));
        }
        return power;
    }
}
