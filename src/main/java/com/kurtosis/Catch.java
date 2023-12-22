package com.kurtosis;
import java.util.Random;

import com.kurtosis.helper.Helper;
import com.kurtosis.pokemon.Pokemon;
import com.kurtosis.constants.Pokeball;

public class Catch implements Helper{
    private User player;
    private Pokemon targetPokemon;
    private Random rand = new Random();


    public Catch(User player, Pokemon targetPokemon) throws CloneNotSupportedException{
        this.player = player;
        this.targetPokemon = targetPokemon;
        Pokeball playerBall = ballRNG();
        capturePokemon(targetPokemon, playerBall);
    }

    private Pokeball ballRNG(){
        System.out.println(" Roll for a ball! ");
        int RNGBall = rand.nextInt(10);
        if(0.1 > Math.random()) {
            System.out.println("RANDOM EVENT: item 'Name' is used!");
            System.out.println("'Name' : Increases luck in rolling for pokeballs!");
            if(RNGBall >2){
                RNGBall -= 2;
            }
        }

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

    private boolean capturePokemon(Pokemon targetPokemon, Pokeball ball){
        System.out.println("You got a " + ball.name + " !");
        if(Helper.QTE(0.1)){
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!");
            Helper.checkExit();
            return true;
        }

        if(rand.nextInt(2) == 1){
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!");
            Helper.checkExit();
            return true;
        }
        else{
            System.out.println("Failed to catch " +targetPokemon.getName()+"!");
            Helper.checkExit();
            return false;
        }
    }
}
