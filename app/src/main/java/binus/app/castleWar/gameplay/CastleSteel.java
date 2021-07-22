package binus.app.castleWar.gameplay;

public class CastleSteel extends Castle {

    public CastleSteel() {
        this.CastleType = Castle.STEEL;
    }

    ArmyInfantry armInf = new ArmyInfantry();
    HeroInfantry heroInf = new HeroInfantry();

    @Override
    public void setArmy(Army[] Armies) {
        armInf.numbers = 100000;

    }

    @Override
    public void setHeroes(Heroes[] heroes) {
        heroInf.numbers = 5;
        heroInf.HERO_LEVEL = 3;
    }

    @Override
    public double calculatePower() {

        power = armInf.HP;

        for (Army army : this.BattleArmy) {
            if (army.ArmyType.equals(Army.INFANTRY)) {
                power = (power * armInf.numbers) + (power * armInf.numbers * Army.INFANTRY_BOOST);
            }
        }

        return power;
    }
}
