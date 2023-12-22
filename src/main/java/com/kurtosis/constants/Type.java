package com.kurtosis.constants;
import java.util.List;

public enum Type {
    NORMAL,
    GRASS,
    ELECTRIC,
    WATER,
    FIRE,
    GHOST,
    PSYCHIC,
    FIGHTING,
    NONE;
    
	public List<Type> weak,strong,noEffect;
    
    static{
    	NORMAL.weak = List.of(FIGHTING);
    	NORMAL.strong = List.of();
    	GRASS.weak = List.of(FIRE);
    	GRASS.strong = List.of(WATER, GRASS, ELECTRIC);
    	ELECTRIC.weak = List.of();
    	ELECTRIC.strong = List.of(ELECTRIC);
    	WATER.weak = List.of(GRASS, ELECTRIC);
    	WATER.strong = List.of(FIRE, WATER);
    	FIRE.weak = List.of(WATER);
    	FIRE.strong = List.of(FIRE, GRASS);
    	GHOST.weak = List.of(GHOST);
    	GHOST.strong = List.of();
    	GHOST.noEffect = List.of(NORMAL, FIGHTING);
    	PSYCHIC.weak = List.of(GHOST);
    	PSYCHIC.strong = List.of(FIGHTING, PSYCHIC);
    	PSYCHIC.noEffect = List.of();
    	FIGHTING.weak = List.of(PSYCHIC);
    	FIGHTING.strong = List.of();
    	FIGHTING.noEffect = List.of();
    	//None to avoid null reference errors
    	NONE.weak = List.of();
    	NONE.strong = List.of();
    	NONE.noEffect = List.of();
    }
}