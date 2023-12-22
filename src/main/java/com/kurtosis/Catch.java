package com.kurtosis;
import java.util.Random;

import com.kurtosis.helper.Helper;
import com.kurtosis.pokemon.Pokemon;
import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.constants.Pokeball;
import com.kurtosis.visual.Renderer;

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
            Renderer.capturing();
            System.out.println(ConsoleColours.RED.text + "===========================================" + ConsoleColours.RESET.text);
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            Renderer.pokeclose();
            Helper.countDown(500, false);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!" + ConsoleColours.RED.text + "======" + ConsoleColours.RED.text);
            Scanner option = new Scanner(System.in);
            System.out.println("Enter 1 to return to main menu and 0 to stop playing.");
            int choice = option.nextInt();

        if (choice == 0){
            System.exit(0);
        } 
        else if (choice == 1) {
            ;
        }
        else{
            System.out.println("Enter '0' or '1' only.");
        }
            return true;
        }

        if(rand.nextInt(2) == 1){
            Renderer.capturing();
            System.out.println(ConsoleColours.RED.text + "===========================================" + ConsoleColours.RESET.text);
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            Renderer.pokeclose();
            Helper.countDown(500, false);
            System.out.println("Gotcha! " + targetPokemon.getName() + " captured!" + ConsoleColours.RED.text + "======" + ConsoleColours.RESET.text);
            Scanner option = new Scanner(System.in);
            System.out.println("Enter 1 to return to main menu and 0 to stop playing.");
            int choice = option.nextInt();

        if (choice == 0){
            System.exit(0);
        } 
        else if (choice == 1) {
            ;
        }
        else{
            System.out.println("Enter '0' or '1' only.");
        }
            return true;
        }
        else{
            Renderer.capturing();
            System.out.println(ConsoleColours.RED.text + "===========================================" + ConsoleColours.RESET.text);
            Helper.countDown(500, false);
            System.out.println("Failed to catch " +targetPokemon.getName()+"!" + ConsoleColours.RED.text + "======" + ConsoleColours.RESET.text);
            Scanner option = new Scanner(System.in);
            System.out.println("Enter 1 to return to main menu and 0 to stop playing.");
            int choice = option.nextInt();

        if (choice == 0){
            System.exit(0);
        } 
        else if (choice == 1) {
            ;
        }
        else{
            System.out.println("Enter '0' or '1' only.");
        }
            return false;
        }
    }
}
