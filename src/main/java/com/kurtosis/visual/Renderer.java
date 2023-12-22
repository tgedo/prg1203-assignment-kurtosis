package com.kurtosis.visual;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.pokemon.Pokemon;

public interface Renderer {
    
    public static void renderHealthBar(Pokemon pokemon){
        System.out.print("|");
        double healthPercentage = 0;
        double maxhealth = pokemon.getMaxHp();
        double currenthealth = pokemon.getHp();
        healthPercentage = (currenthealth/maxhealth)*10;
        System.out.print(ConsoleColours.RED.background);
        int x = 0;
        for(; x < healthPercentage; x++) {
            System.out.print("__");
        }
        System.out.print(ConsoleColours.RESET.background);
        System.out.print(ConsoleColours.WHITE.background);
        for(; x < 10; x++) {
            System.out.print("__");
        }
        System.out.println(ConsoleColours.RESET.background);
    }
    
}
