package binus.app.castleWar.gameplay;

public class HeroArcher extends Heroes {
    ArmyArcher armArch = new ArmyArcher();
    HeroArcher heroArch = new HeroArcher();

    int HERO_LEVEL = Heroes.HERO_LEVEL;

    @Override
    public double attackMultiplayer() {
        power = armArch.HP;
        if (armArch.ArmyType == ARCHER) {

            power = (power * armArch.numbers) + ((power * armArch.numbers)*(heroArch.numbers* Heroes.ARCHER_BOOST));
        }
        return power;
    }
}
