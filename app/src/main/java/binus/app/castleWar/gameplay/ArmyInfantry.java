package binus.app.castleWar.gameplay;

public class ArmyInfantry extends Army {
    ArmyArcher armArch = new ArmyArcher();
    ArmyCavalry armCav = new ArmyCavalry();

    public ArmyInfantry() {
        this.ArmyType = Army.INFANTRY;
    }

    public int HP = 1;

    @Override
    public double attack(Army army) {
        if (army.ArmyType == CAVALRY) {
            killCapable = 0.1 * armCav.HP * armCav.numbers;
            armCav.numbers -= (int) killCapable;
        } else if (army.ArmyType == ARCHER) {
            killCapable = 0.4 * armArch.HP * armArch.numbers;
            armArch.numbers -= (int) killCapable;
        }

        return killCapable;
    }
}
