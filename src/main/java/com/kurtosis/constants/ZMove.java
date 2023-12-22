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
            ZNORMAL.zmoveName = "BreakneckBlitz";
            ZNORMAL.isSpecial = false;
            ZGRASS.type = Type.GRASS;
            ZGRASS.power = 200;
            ZGRASS.isSpecial = true;
            ZGRASS.zmoveName = "BloomDoom";
            ZELEC.type = Type.ELECTRIC;
            ZELEC.power = 200;
            ZELEC.isSpecial = true;
            ZELEC.zmoveName = "GigavoltHavoc";
            ZWATER.type = Type.WATER;
            ZWATER.power = 200;
            ZWATER.isSpecial = true;
            ZWATER.zmoveName = "HydroVortex";
            ZFIRE.type = Type.FIRE;
            ZFIRE.power = 200;
            ZFIRE.isSpecial = true;
            ZFIRE.zmoveName = "InfernoOverdrive";
            ZGHOST.type = Type.GHOST;
            ZGHOST.power = 200;
            ZGHOST.isSpecial = false;
            ZGHOST.zmoveName = "UnendingNightmare";
            ZPSY.type = Type.PSYCHIC;
            ZPSY.power = 200;
            ZPSY.isSpecial = true;
            ZPSY.zmoveName = "ShatteredPsyche";
            ZFIGHT.type = Type.FIGHTING;
            ZFIGHT.power = 200;
            ZFIGHT.isSpecial = false;
            ZFIGHT.zmoveName = "All-OutPummeling";
            ZNULL.type = Type.NONE;
            ZNULL.power = 1;
            ZNULL.isSpecial = true;
            ZNULL.zmoveName = "SuperStruggle";
        }
    }





