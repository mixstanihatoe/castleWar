package binus.app.castleWar.gameplay;

public abstract class Castle {
    public static final String STEEL = "STEEL";
    public static final String HORSE = "HORSE";
    public static final String WOOD = "WOOD";
    public static final String STONE = "STONE";


    public String CastleType;
    public Heroes[] BattleHeroes;
    public Army[] BattleArmy;
    public double power;


    public String getCastleType() {
        return this.CastleType;
    }

    public abstract double calculatePower();

    public abstract void setArmy(Army[] Armies);

    public abstract void setHeroes(Heroes[] Heroes);




}
