package com.kurtosis.pokemon;
import java.util.ArrayList;
import java.util.Random;

import com.kurtosis.constants.Move;
import com.kurtosis.constants.ZMove;

public class PokemonPool {
    public static ArrayList<Pokemon> pokemonRate = new ArrayList<Pokemon>();

    public static void setPokemonRate(int commonRatio, int uncommonRatio, int rareRatio){
        for(int common = 0; common < commonRatio; common++){
            addCommonPokemon();
        }
        for(int uncommon = 0; uncommon < uncommonRatio; uncommon++){
            addUncommonPokemon();
        }
        for(int rare = 0; rare < rareRatio; rare++){
            addRarePokemon();
        }
    }

    //TODO: Change Stats
    private static void addCommonPokemon(){
        pokemonRate.add(new WaterType("Squirtle", 66, 35, 44, 43, 33, Move.WATERGUN,ZMove.ZWATER ,0.5));
        pokemonRate.add(new FireType("Charmander",60, 40, 34, 33, 36, Move.EMBER, ZMove.ZFIRE,0.5));
        pokemonRate.add(new FightingType("Machop",59, 45, 30, 29, 40, Move.KARATECHOP,ZMove.ZFIGHT ,0.5));
        pokemonRate.add(new NormalType("Meowth",67, 39, 40, 40, 50, Move.SCRATCH, ZMove.ZNORMAL,0.5));
    }

    private static void addUncommonPokemon(){
        pokemonRate.add(new ElectricType("Pikachu",60, 53, 40, 50, 60, Move.THUNDERBOLT,ZMove.ZELEC, 0.4));
        pokemonRate.add(new GhostType("Haunter",70, 40, 50, 40, 49, Move.HEX,ZMove.ZGHOST,0.4));
    }

    private static void addRarePokemon(){
        pokemonRate.add(new PsychicType("Mewtwo",100, 90, 50, 50, 70, Move.PSYSHOCK,ZMove.ZPSY,0.1));
        pokemonRate.add(new GrassType("Venusaur",120, 60, 50, 43, 33, Move.RAZORLEAF,ZMove.ZGRASS ,0.1));
    }

    /**Generate Pokemon to REFER, make sure to make a clone of the pokemon object */
    public static Pokemon referencePokemon(){
        Random random = new Random();
        int rngChoosen = random.nextInt(pokemonRate.size());
        return pokemonRate.get(rngChoosen);
    }
}

