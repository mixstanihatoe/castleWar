package binus.app.castleWar.gameplay;

import android.app.Activity;
import android.widget.Toast;

public class BattleWorker implements Runnable {
    CastleHorse cHorse = new CastleHorse();
    CastleWood cWood = new CastleWood();
    CastleSteel cSteel = new CastleSteel();
    ArmyArcher armArch = new ArmyArcher();
    ArmyCavalry armCav = new ArmyCavalry();
    ArmyInfantry armInf = new ArmyInfantry();
    public String winner = "";


    public String battle1() {
        cHorse.setArmy(cHorse.BattleArmy);
        cHorse.setHeroes(cHorse.BattleHeroes);
        cSteel.setArmy(cSteel.BattleArmy);
        cSteel.setHeroes(cSteel.BattleHeroes);
        armCav.attack(armInf);
        armInf.attack(armCav);
        if (armCav.numbers > armInf.numbers) {
            winner = "Castle Horse";
        } else {
            winner = "Castle Steel";
        }
        return winner;
    }

    public String battle2() {
        cSteel.setArmy(cSteel.BattleArmy);
        cSteel.setHeroes(cSteel.BattleHeroes);
        cWood.setArmy(cWood.BattleArmy);
        cWood.setHeroes(cSteel.BattleHeroes);
        armCav.attack(armInf);
        armArch.attack(armInf);
        armInf.attack(armArch);
        armInf.attack(armArch);
        if (armInf.numbers > (armArch.numbers + armCav.numbers)){
            winner = "Castle Steel";
        }else{
            winner = "Castle Wood";
        }
            return winner;

    }

    @Override
    public void run() {
        battle1();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        battle2();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
