import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Pokemon {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    /**Pokemon Special Defense Stat */
    protected int spd; 
    /** Pokemon Speed Stat */
    protected int spe;
    protected String type; 
    protected boolean moveIsSpecial;
    protected double catchRate;
    protected int actionValue = 1000;

    public static String[] commonPokemon = {"Squirtle", "Charmander","Machop","Meowth"};
    public static String[] uncommonPokemon = {"Pikachu","Haunter"};
    public static String[] rarePokemon = {"Mewtwo","Venusaur"};
    public static ArrayList<String> pokemonRate = new ArrayList<String>();

    public Pokemon() {
        name = "MissingNo.";
        hp = 33;
        atk = 136;
        def = 0;
        spd = 6;
        spe = 29;
        type = "Normal";
        moveIsSpecial = false;
        catchRate = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    /** Returns pokemon special defense stat */
    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    /** Returns pokemon speed stat */
    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public boolean isMoveIsSpecial() {
        return moveIsSpecial;
    }

    public void setMoveIsSpecial(boolean moveIsSpecial) {
        this.moveIsSpecial = moveIsSpecial;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
    }
    public String takeDamage(int enemyPower){
        return "The attack is effective";
    }

    public static void setPokemonRate(int commonRatio, int uncommonRatio, int rareRatio){
        for(int common = 0; common < commonRatio; common++){
            pokemonRate.addAll(Arrays.asList(commonPokemon));
        }
        for(int uncommon = 0; uncommon < uncommonRatio; uncommon++){
            pokemonRate.addAll(Arrays.asList(uncommonPokemon));
        }
        for(int rare = 0; rare < rareRatio; rare++){
            pokemonRate.addAll(Arrays.asList(commonPokemon));
        }
    }

    
    public int getActionValue() {
        return actionValue;
    }

/**Decrease the pokemon's action value by it's speed. @param speed */
    public void decreaseActionValue(int speed) {
        this.actionValue -= speed;
    }

    public static Pokemon generatePokemon(){
        Random random = new Random();
        int rngChoosen = random.nextInt(pokemonRate.size()); 
        return generatedPokemon;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", spd=" + spd +
                ", spe=" + spe +
                ", moveSpecial=" + moveIsSpecial +
                ", catchRate=" + catchRate +
                '}';
    }
}

