package binus.app.castleWar.gameplay;

public abstract class Heroes {
    public static final String INFANTRY = "INFANTRY";
    public static final String CAVALRY = "CAVALRY";
    public static final String ARCHER = "ARCHER";
    public static final String CATAPULT = "CATAPULT";

    public static final Double INFANTRY_BOOST = 0.4;
    public static final Double CAVALRY_BOOST = 0.4;
    public static final Double ARCHER_BOOST = 0.4;
    public static final Double CATAPULT_BOOST = 0.4;

    public static int HERO_LEVEL;
    public String HeroType;
    public int numbers;
    public double power;
    public static double multiplayerPoints;
    public abstract double attackMultiplayer ();

}

