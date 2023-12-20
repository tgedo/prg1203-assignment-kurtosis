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

        RESET.text = "\u001B[0m";
        RESET.background ="\u001B[0m";
    }
    
}
