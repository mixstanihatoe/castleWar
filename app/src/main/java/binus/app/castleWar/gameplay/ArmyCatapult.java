package binus.app.castleWar.gameplay;

public class ArmyCatapult extends Army {
    ArmyInfantry armInf = new ArmyInfantry();
    ArmyArcher armArch = new ArmyArcher();
    ArmyCavalry armCav = new ArmyCavalry();

    public ArmyCatapult() {
        this.ArmyType = Army.CATAPULT;
    }


    public int HP = 1;

    @Override
    public double attack(Army army) {
        if (army.ArmyType == ARCHER) {
            killCapable = 5 * armArch.HP * armArch.numbers;
            armArch.numbers -= (int) killCapable;

        } else if (army.ArmyType == INFANTRY) {
            killCapable = 3 * armInf.HP * armInf.numbers;
            armInf.numbers -= (int) killCapable;

        } else if (army.ArmyType == CAVALRY) {
            killCapable = 1 * armCav.HP * armCav.numbers;
            armCav.numbers -= (int) killCapable;
        }
        return killCapable;
    }
}
