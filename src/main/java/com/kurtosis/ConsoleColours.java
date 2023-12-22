package com.kurtosis;
import java.time.Year;

public enum ConsoleColours {
    BLACK,
    RED,
    GREEN,
    YELLOW,
    BLUE,
    PURPLE,
    CYAN,
    WHITE,
    RESET;

    String text,background;
    static{
        BLACK.text = "\u001B[30m";
        BLACK.background = "\u001B[40m";
        RED.text = "\u001B[31m";
        RED.background = "\u001B[41m";
        GREEN.text = "\u001B[32m";
        GREEN.background = "\u001B[42m";
        YELLOW.text = "\u001B[33m";
        YELLOW.background ="\u001B[43m";
        BLUE.text = "\033[0;34m";
        BLUE.background ="\033[44m";
        PURPLE.text = "\033[0;35m";
        PURPLE.background ="\033[45m";
        CYAN.text = "\033[0;36m";
        CYAN.background ="\033[46m";
        WHITE.text = "\033[0;37m";
        WHITE.background ="\033[47m";

        RESET.text = "\u001B[0m";
        RESET.background ="\u001B[0m";
    }
    
}
