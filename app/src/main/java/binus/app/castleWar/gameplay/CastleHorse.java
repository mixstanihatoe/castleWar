package binus.app.castleWar.gameplay;

public class CastleHorse extends Castle {


    public CastleHorse() {
        this.CastleType = Castle.HORSE;
    }

    ArmyCavalry armCav = new ArmyCavalry();
    HeroCavalry heroCav = new HeroCavalry();

    @Override
    public void setArmy(Army[] BattleArmies) {

        armCav.numbers = 100000;
    }

    @Override
    public void setHeroes(Heroes[] BattleHeroes) {
        heroCav.numbers = 5;
        heroCav.HERO_LEVEL = 3;
        heroCav.attackMultiplayer();
    }

    @Override
    public double calculatePower() {
        power = armCav.HP;

        for (Army army : this.BattleArmy) {
            if (army.ArmyType.equals(Army.CAVALRY)) {
                power = (power * armCav.numbers) + (power * armCav.numbers * Army.CAVALRY_BOOST);
            } else {
                power = power * army.numbers;
            }
        }
        return power;
    }
}
