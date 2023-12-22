package com.kurtosis.constants;

    enum Pokeball{
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
            POKEBALL.name = "Pokeball";
        }
    }  