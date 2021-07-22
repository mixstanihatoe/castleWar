package binus.app.castleWar.gameplay;

public class CastleStone extends Castle {
    public CastleStone() {
        this.CastleType = Castle.STONE;
    }

    @Override
    public void setArmy(Army[] Armies) {

    }

    @Override
    public void setHeroes(Heroes[] heroes) {

    }
    @Override
    public double calculatePower() {
        ArmyCatapult armCat = new ArmyCatapult();
        power = armCat.HP;

        for (Army army : this.BattleArmy) {
            if (army.ArmyType.equals(Army.CATAPULT)) {
                power = (power * armCat.numbers) + (power * armCat.numbers * Army.CATAPULT_BOOST);
            }
        }

        return power;
    }

}
