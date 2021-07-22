package binus.app.castleWar.gameplay;

public class ArmyArcher extends Army {
    ArmyInfantry armInf = new ArmyInfantry();
    ArmyCavalry armCav = new ArmyCavalry();

    public ArmyArcher() {
        this.ArmyType = Army.ARCHER;
    }

    public int HP = 1;

    @Override
    public double attack(Army army) {
        if (army.ArmyType == INFANTRY) {
            killCapable = 0.1 * armInf.HP * armInf.numbers;
            armInf.numbers -= (int) killCapable;

        } else if (army.ArmyType == CAVALRY) {
            killCapable = 0.4 * armCav.HP * armCav.numbers;
            armCav.numbers -= (int) killCapable;
        }

        return killCapable;
    }
}
