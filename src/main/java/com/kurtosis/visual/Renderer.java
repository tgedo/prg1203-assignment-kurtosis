package com.kurtosis.visual;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.helper.Helper;
import com.kurtosis.pokemon.Pokemon;

public interface Renderer {
    public static void pokeclose(){
        String pokeball2 = ConsoleColours.YELLOW.text + "      ,\r\n" + //
                "   \\  :  /\r\n" + //
                "`. __/ \\__ .'\r\n" + //
                "_ _\\     /_ _\r\n" + //
                "   /_   _\\\r\n" + //
                " .'  \\ /  `.\r\n" + //
                "   /  :  \\    \r\n" + //
                "      '" + ConsoleColours.RESET.text;
        System.out.println(pokeball2);
        System.out.println(ConsoleColours.RED.text + "===========================================" + ConsoleColours.RESET.text);
    }

    public static void capturing(){
        System.out.print("Catching.");
        Helper.wait(500);
        System.out.print(".");
        Helper.wait(500);
        System.out.println(".");
    }

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
