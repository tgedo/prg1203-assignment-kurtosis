import java.util.Random;

public class Catch {
    private User player;
    private Pokemon targetPokemon;
    private Random rand = new Random();
    private enum Pokeball{
        POKEBALL,
        SUPERBALL,
        ULTRABALL,
        MASTERBALL;
        public double rate;
        static{
            POKEBALL.rate = 1;
            SUPERBALL.rate = 1.5;
            ULTRABALL.rate = 2;
            MASTERBALL.rate = 1000;
        }
    }  

    public Catch(User player, Pokemon targetPokemon) throws CloneNotSupportedException{
        this.player = player;
        this.targetPokemon = targetPokemon;
        Pokeball playerBall = ballRNG();
        capturePokemon(targetPokemon, playerBall);
    }

     //TODO : redesign, boring
    private Pokeball ballRNG(){
        int RNGBall = rand.nextInt(10);
        if (RNGBall == 0){
            return Pokeball.MASTERBALL;
        }
        else if(RNGBall < 3){
            return Pokeball.ULTRABALL;
        }
        else if(RNGBall < 6){
            return Pokeball.SUPERBALL;
        }
        else{
            return Pokeball.POKEBALL;
        }
    }

    //TODO:write formula
    private void capturePokemon(Pokemon targetPokemon, Pokeball ball){
        if(rand.nextInt(1) == 1){
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!");
        }
        else{
            System.out.println("Failed to catch " +targetPokemon.getName()+"!");
        }
    }
}
