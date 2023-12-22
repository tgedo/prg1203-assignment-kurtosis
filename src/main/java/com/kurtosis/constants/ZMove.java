package com.kurtosis.constants;

public enum ZMove {
    ZNORMAL,
    ZGRASS,
    ZELEC,
    ZWATER,
    ZFIRE,
    ZGHOST,
    ZPSY,
    ZFIGHT,
    ZNULL;
        public Type type;
        public String zmoveName;
        public int power;
        public boolean isSpecial;
        static {
            ZNORMAL.type = Type.NORMAL;
            ZNORMAL.power = 200;
            ZNORMAL.zmoveName =ConsoleColours.WHITE.background + ConsoleColours.BLACK.text + "BreakneckBlitz" + ConsoleColours.RESET.background;
            ZNORMAL.isSpecial = false;
            ZGRASS.type = Type.GRASS;
            ZGRASS.power = 200;
            ZGRASS.isSpecial = true;
            ZGRASS.zmoveName = ConsoleColours.GREEN.background + "Bloom Doom" + ConsoleColours.RESET.background;
            ZELEC.type = Type.ELECTRIC;
            ZELEC.power = 200;
            ZELEC.isSpecial = true;
            ZELEC.zmoveName = ConsoleColours.YELLOW.background + "Gigavolt Havoc"+ ConsoleColours.RESET.background;
            ZWATER.type = Type.WATER;
            ZWATER.power = 200;
            ZWATER.isSpecial = true;
            ZWATER.zmoveName = ConsoleColours.BLUE.background +  "Hydro Vortex" + ConsoleColours.RESET.background;
            ZFIRE.type = Type.FIRE;
            ZFIRE.power = 200;
            ZFIRE.isSpecial = true;
            ZFIRE.zmoveName = ConsoleColours.RED.background + "Inferno Overdrive" + ConsoleColours.RESET.background;
            ZGHOST.type = Type.GHOST;
            ZGHOST.power = 200;
            ZGHOST.isSpecial = false;
            ZGHOST.zmoveName = ConsoleColours.BLACK.background + ConsoleColours.WHITE.text +  "Unending Nightmare" + ConsoleColours.RESET.background;
            ZPSY.type = Type.PSYCHIC;
            ZPSY.power = 200;
            ZPSY.isSpecial = true;
            ZPSY.zmoveName = ConsoleColours.PURPLE.background + "Shattered Psyche" +ConsoleColours.RESET.background;
            ZFIGHT.type = Type.FIGHTING;
            ZFIGHT.power = 200;
            ZFIGHT.isSpecial = false;
            ZFIGHT.zmoveName = ConsoleColours.WHITE.background + ConsoleColours.BLACK.text + "All-OutPummeling" + ConsoleColours.RESET.background;
            ZNULL.type = Type.NONE;
            ZNULL.power = 1;
            ZNULL.isSpecial = true;
            ZNULL.zmoveName = "SuperStruggle";
        }
    }





