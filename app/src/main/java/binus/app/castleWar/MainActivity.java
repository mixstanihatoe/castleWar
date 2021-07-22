package binus.app.castleWar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import binus.app.castleWar.gameplay.ArmyArcher;
import binus.app.castleWar.gameplay.ArmyCavalry;
import binus.app.castleWar.gameplay.ArmyInfantry;
import binus.app.castleWar.gameplay.CastleStone;
import binus.app.castleWar.gameplay.CastleWood;
import binus.app.castleWar.gameplay.BattleWorker;
import binus.app.castleWar.gameplay.Castle;
import binus.app.castleWar.gameplay.CastleHorse;
import binus.app.castleWar.gameplay.CastleSteel;
import binus.app.castleWar.gameplay.HeroArcher;
import binus.app.castleWar.gameplay.HeroCavalry;
import binus.app.castleWar.gameplay.HeroInfantry;

import java.lang.Thread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Activity act = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CastleHorse cHorse = new CastleHorse();
        CastleWood cWood = new CastleWood();
        CastleSteel cSteel = new CastleSteel();
        CastleStone cStone = new CastleStone();
        BattleWorker bw = new BattleWorker();

        Castle[] fightingCastles = new Castle[4];
        fightingCastles[0] = cSteel;
        fightingCastles[1] = cHorse;
        fightingCastles[2] = cWood;
        fightingCastles [3] = cStone;
        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.fightNowBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new BattleWorker()).start();
                Toast.makeText(act, "Winner is " + bw.winner, Toast.LENGTH_SHORT).show();



            }
        });
    }


    private void initCastleImageBattle(Castle[] castles) {
        Castle left = castles[0];
        Castle right = castles[1];

        loadCastleImage(findViewById(R.id.castleLeft), left);
        loadCastleImage(findViewById(R.id.castleRight), right);

    }

    private void loadCastleImage(ImageView iView, Castle castle) {
        if (castle instanceof CastleHorse) {
            iView.setBackgroundResource(R.drawable.cavalry);
        } else if (castle instanceof CastleSteel) {
            iView.setBackgroundResource(R.drawable.infantry);
        } else if (castle instanceof CastleWood) {
            iView.setBackgroundResource(R.drawable.archer);
        } else {
            iView.setBackgroundResource(R.drawable.catapult);
        }
    }


}