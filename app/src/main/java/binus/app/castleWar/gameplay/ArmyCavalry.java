package binus.app.castleWar.gameplay;

public class ArmyCavalry extends Army {

    ArmyInfantry armInf = new ArmyInfantry();
    ArmyArcher armArch = new ArmyArcher();

    public ArmyCavalry() {
        this.ArmyType = Army.CAVALRY;
    }

    public int HP = 1;

    @Override
    public double attack(Army army) {
        if (army.ArmyType == ARCHER) {
            killCapable = 0.1 * armArch.HP * armArch.HP;
            armArch.numbers -= (int) killCapable;

        } else if (army.ArmyType == INFANTRY) {
            killCapable = 0.4 * armInf.HP * armInf.numbers;
            armInf.numbers -= (int) killCapable;
        }

        return killCapable;
    }
}
