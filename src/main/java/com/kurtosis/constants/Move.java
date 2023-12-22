package com.kurtosis.constants;

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

    public Type type;
    public String moveName;
    public int power;
    public boolean isSpecial;
    static {
        SCRATCH.type = Type.NORMAL;
        SCRATCH.power = 30;
        SCRATCH.moveName = "Scratch";
        SCRATCH.isSpecial = false;
        RAZORLEAF.type = Type.GRASS;
        RAZORLEAF.power = 50;
        RAZORLEAF.isSpecial = true;
        RAZORLEAF.moveName = "RazorLeaf";
        THUNDERBOLT.type = Type.ELECTRIC;
        THUNDERBOLT.power = 50;
        THUNDERBOLT.isSpecial = true;
        THUNDERBOLT.moveName = ConsoleColours.YELLOW.text + "ThunderBolt" + ConsoleColours.RESET.text;
        WATERGUN.type = Type.WATER;
        WATERGUN.power = 30;
        WATERGUN.isSpecial = true;
        WATERGUN.moveName = "WaterGun";
        EMBER.type = Type.FIRE;
        EMBER.power = 30;
        EMBER.isSpecial = true;
        EMBER.moveName = "Ember";
        HEX.type = Type.GHOST;
        HEX.power = 50;
        HEX.isSpecial = false;
        HEX.moveName = "Hex";
        PSYSHOCK.type = Type.PSYCHIC;
        PSYSHOCK.power = 50;
        PSYSHOCK.isSpecial = true;
        PSYSHOCK.moveName = "Psyshock";
        KARATECHOP.type = Type.FIGHTING;
        KARATECHOP.power = 30;
        KARATECHOP.isSpecial = false;
        KARATECHOP.moveName = "KarateChop";
        NULLMOVE.type = Type.NONE;
        NULLMOVE.power = 1;
        NULLMOVE.isSpecial = true;
        NULLMOVE.moveName = "Struggle";
    }
}



