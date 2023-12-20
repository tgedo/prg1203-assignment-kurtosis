import java.util.ArrayList;
import java.util.Random;

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
        pokemonRate.add(new WaterType("Squirtle", 66, 35, 44, 43, 33, true, 0.4));
        pokemonRate.add(new FireType("Charmander",66, 35, 44, 43, 33, true, 0.4));
        pokemonRate.add(new FightingType("Machop",66, 35, 44, 43, 33, true, 0.4));
        pokemonRate.add(new NormalType("Meowth",66, 35, 44, 43, 33, true, 0.4));
    }

    private static void addUncommonPokemon(){
        pokemonRate.add(new ElectricType("Pikachu",66, 35, 44, 43, 33, true, 0.4));
        pokemonRate.add(new GhostType("Haunter",66, 35, 44, 43, 33, true, 0.4));
    }

    private static void addRarePokemon(){
        pokemonRate.add(new PsychicType("Mewtwo",66, 35, 44, 43, 33, true, 0.4));
        pokemonRate.add(new GrassType("Venusaur",66, 35, 44, 43, 33, true, 0.4));
    }

    /**Generate Pokemon to REFER, make sure to make a clone of the pokemon object */
    public static Pokemon referencePokemon(){
        Random random = new Random();
        int rngChoosen = random.nextInt(pokemonRate.size());
        return pokemonRate.get(rngChoosen);
    }
}

