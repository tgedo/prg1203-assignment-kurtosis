package com.kurtosis;
import java.util.Random;
import java.util.Scanner;

import com.kurtosis.helper.Helper;
import com.kurtosis.pokemon.Pokemon;
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
            Renderer.wait(500);
            Renderer.pokeopen();
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            Renderer.pokeclose();
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
            Renderer.wait(500);
            Renderer.pokeopen();
            this.targetPokemon.healHealth(1000);
            player.AddPokemonIntoDeck(targetPokemon);
            Renderer.pokeclose();
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
            System.out.print("Catching.");
            Renderer.wait(1000);
            System.out.print(".");
            Renderer.wait(1000);
            System.out.println(".");
            System.out.println("===========================================");
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
