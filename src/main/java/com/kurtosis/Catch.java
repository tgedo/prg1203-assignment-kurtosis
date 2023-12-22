package com.kurtosis;
import java.util.Random;
import java.util.Scanner;

import com.kurtosis.helper.Helper;
import com.kurtosis.pokemon.Pokemon;

public class Catch implements Helper{
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

    private boolean capturePokemon(Pokemon targetPokemon, Pokeball ball){
        if(Helper.QTE(0.1)){
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!");
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
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            System.out.println("Gotcha! " +targetPokemon.getName()+ " captured!");
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
            System.out.println("Failed to catch " +targetPokemon.getName()+"!");
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
