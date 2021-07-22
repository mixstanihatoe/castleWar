package binus.app.castleWar.gameplay;

public abstract class Army {

    public static final String ARCHER = "ARCHER";
    public static final String CAVALRY = "CAVALRY";
    public static final String INFANTRY = "INFANTRY";
    public static final String CATAPULT = "CATAPULT";

    public static final double ARCHER_BOOST = 1.2;
    public static final double CAVALRY_BOOST = 1.2;
    public static final double INFANTRY_BOOST = 1.2;
    public static final double CATAPULT_BOOST = 1.2;

    public String ArmyType;
    public int numbers;
    public static double killCapable;

    public abstract double attack (Army army);




}
