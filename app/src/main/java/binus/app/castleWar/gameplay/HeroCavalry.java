package binus.app.castleWar.gameplay;

public class HeroCavalry extends Heroes {
    ArmyCavalry armCav = new ArmyCavalry();
    HeroCavalry heroCav = new HeroCavalry();

    int HERO_LEVEL = Heroes.HERO_LEVEL;

    @Override
    public double attackMultiplayer() {
        power = armCav.HP;
        if (armCav.ArmyType == CAVALRY) {

            power = (power * armCav.numbers) + ((power * armCav.numbers)*(heroCav.numbers* Heroes.CAVALRY_BOOST));
        }
        return power;
    }
}

