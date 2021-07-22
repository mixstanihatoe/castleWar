package binus.app.castleWar.gameplay;

public class CastleWood extends Castle {

    public CastleWood() {
        this.CastleType = Castle.WOOD;
    }

    ArmyArcher armArch = new ArmyArcher();
    ArmyCavalry armCav = new ArmyCavalry();
    HeroArcher heroArc = new HeroArcher();
    HeroCavalry heroCav = new HeroCavalry();

    @Override
    public void setArmy(Army[] Armies) {
        armCav.numbers = 75000;
        armArch.numbers = 25000;
    }

    @Override
    public void setHeroes(Heroes[] heroes) {
        heroArc.numbers = 5;
        heroArc.HERO_LEVEL = 7;
    }

    @Override
    public double calculatePower() {
        ArmyArcher armArch = new ArmyArcher();
        power = armArch.HP;


        for (Army army : this.BattleArmy)
            if (army.ArmyType.equals(Army.ARCHER)) {
                power = (power * armArch.numbers) + (power * armArch.numbers * Army.ARCHER_BOOST);
            }

        return power;

    }


}
