package com.kurtosis.constants;

    public enum Pokeball{
        POKEBALL,
        SUPERBALL,
        ULTRABALL,
        MASTERBALL;
        public double rate;
        public String name;
        static{
            POKEBALL.rate = 1;
            SUPERBALL.rate = 1.5;
            ULTRABALL.rate = 2;
            MASTERBALL.rate = 1000;
            POKEBALL.name = ConsoleColours.RED.background + ConsoleColours.WHITE.text + "Poke" +ConsoleColours.WHITE.background + ConsoleColours.RED.text + "ball" + ConsoleColours.RESET.background;
            SUPERBALL.name = ConsoleColours.BLUE.background + ConsoleColours.RED.text + "Super" + ConsoleColours.WHITE.background + ConsoleColours.BLUE.text + "ball" + ConsoleColours.RESET.background;
            ULTRABALL.name = ConsoleColours.BLACK.background + ConsoleColours.YELLOW.text + "Ultra" + ConsoleColours.WHITE.background + ConsoleColours.BLACK.text + "ball" + ConsoleColours.RESET.background;
            MASTERBALL.name = ConsoleColours.PURPLE.background + ConsoleColours.RED.text + "Master" + ConsoleColours.WHITE.background + ConsoleColours.PURPLE.text + "ball" + ConsoleColours.RESET.background;

        }
    }  