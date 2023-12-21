public enum Move {
    SCRATCH,
    RAZORLEAF,
    THUNDERBOLT,
    WATERGUN,
    EMBER,
    HEX,
    PSYSHOCK,
    KARATECHOP,
    NULLMOVE;

    Type type;
    String moveName;
    int power;
    boolean isSpecial;
    static {
        SCRATCH.type = Type.NORMAL;
        SCRATCH.power = 50;
        SCRATCH.isSpecial = false;
        RAZORLEAF.type = Type.GRASS;
        RAZORLEAF.power = 50;
        RAZORLEAF.isSpecial = true;
        THUNDERBOLT.type = Type.ELECTRIC;
        THUNDERBOLT.power = 50;
        THUNDERBOLT.isSpecial = true;
        THUNDERBOLT.moveName = ConsoleColours.YELLOW.text + "ThunderBolt" + ConsoleColours.RESET.text;
        WATERGUN.type = Type.WATER;
        WATERGUN.power = 50;
        WATERGUN.isSpecial = true;
        EMBER.type = Type.FIRE;
        EMBER.power = 50;
        EMBER.isSpecial = true;
        HEX.type = Type.GHOST;
        HEX.power = 50;
        HEX.isSpecial = false;
        PSYSHOCK.type = Type.PSYCHIC;
        PSYSHOCK.power = 50;
        PSYSHOCK.isSpecial = true;
        KARATECHOP.type = Type.FIGHTING;
        KARATECHOP.power = 50;
        KARATECHOP.isSpecial = false;
        NULLMOVE.type = Type.NONE;
        NULLMOVE.power = 1;
        NULLMOVE.isSpecial = true;
    }
}



