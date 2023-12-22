package com.kurtosis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.leaderboard.Leaderboard;
import com.kurtosis.pokemon.Pokemon;
import com.kurtosis.pokemon.PokemonPool;

public class Main {
    static private String info = ConsoleColours.YELLOW.text + "                                  ,'\\\r\n" + //
            "    _.----.        ____         ,'  _\\   ___    ___     ____\r\n" + //
            "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n" + //
            "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n" + //
            " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n" + //
            "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n" + //
            "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n" + //
            "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n" + //
            "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n" + //
            "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n" + //
            "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n" + //
            "                                `'                            '-._|" + ConsoleColours.RESET.text; //TODO add more info
    static Scanner sc = new Scanner(System.in);
    static int playerDecision;
    static String playerQTE;
    static String choicesMessage = "";
    static String errorMessage = "";

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        User.deserializeUsers("users.ser");
        PokemonPool.setPokemonRate(3, 2, 1);
        while (true) {
            User player = MainMenu();
            try{
            StartGame(player);
            for (User user : User.userList) {
                User.serializeUser(user, "users.ser");
            }
            User.deserializeUsers("users.ser");}
            catch(Exception e){
                continue;
            }
        }
    }

    public static User MainMenu() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        String[] options = {ConsoleColours.GREEN.text + "Continue" + ConsoleColours.RESET.background, ConsoleColours.YELLOW.text + "New" + ConsoleColours.RESET.text , ConsoleColours.CYAN.text + "Leaderboard" + ConsoleColours.RESET.text, ConsoleColours.RED.text + "Quit" + ConsoleColours.RESET.text};
        System.out.println(info);
        

        for (int choice = 1; choice <= options.length; choice++) {
            choicesMessage += (choice + " : " + options[choice - 1] + "\n");
        }

        choicesMessage += ("\n Choose an option!");
        validateSelection(1, options.length);

        sc.nextLine();
        
        //Player chooses Continue
        System.out.println(ConsoleColours.RESET.background);
        if (playerDecision == 1){
           while (true) {
            System.out.println(errorMessage);
            System.out.println();
            System.out.println("Attempting login...");
            System.out.println("Enter a Username: ");
            String loginName = sc.nextLine();
            System.out.println("Enter a Password: ");
            String loginPass = sc.nextLine();
        
            for(User user : User.userList){
                // System.out.println("Scanning :" + user.getUserName());
                if(user.getUserName().contains(loginName)){
                    errorMessage = "Password Incorrect!";
                    if(user.getUserPass().equals(loginPass)){
                        System.out.println("Success! Logging in as " + loginName);
                        errorMessage = "";
                        return user;
                    }
                }
                errorMessage = "No user found!";
                continue;
            }
        }
    }

        //Player chooses New
        else if (playerDecision == 2) {
            System.out.println("Creating a new account...");
            System.out.println("Enter a Username: ");
            String newUserName = sc.nextLine();
            System.out.println("Enter a Password: ");
            String newUserPass = sc.nextLine();

            User newUser = new User(newUserName, newUserPass);
            //Generating Starters
            ArrayList<Pokemon> starters = new ArrayList<>();
            starters.add(PokemonPool.referencePokemon());
            starters.add(PokemonPool.referencePokemon());
            starters.add(PokemonPool.referencePokemon());

            //Choose Starter 1
            for (int starter = 1; starter <= starters.size(); starter++) {
                choicesMessage += (starter + " : " + starters.get(starter - 1).getName() + '\n');
            }
            choicesMessage += ("\n Pick a starter!");
            validateSelection(1, starters.size());
            newUser.AddPokemonIntoDeck(starters.get(playerDecision - 1).clone());
            starters.remove(playerDecision - 1);

            //Choose Starter 2
            for (int starter = 1; starter <= starters.size(); starter++) {
                choicesMessage += (starter + " : " + starters.get(starter - 1).getName() + '\n');
            }
            choicesMessage += ("\n Pick a starter!");
            validateSelection(1, starters.size());
            newUser.AddPokemonIntoDeck(starters.get(playerDecision - 1).clone());
            return newUser;
        } else if (playerDecision == 3) {
            Leaderboard.displayLeaderboard();
            return null;
        }

        //Player chooses Quit
        else {
            return null;
        }
    }

    public static void StartGame(User player) throws CloneNotSupportedException{
        new Battle(player, PokemonPool.referencePokemon().clone(), PokemonPool.referencePokemon().clone());
    };

    static void validateSelection(int min,int max){
        while (true) {
            System.out.println(choicesMessage);
            System.out.println(errorMessage);
             try{
                playerDecision = sc.nextInt();
            } catch(Exception e){
                errorMessage = "Choose an integer!";
                sc.nextLine();
                continue;
            };
            if (playerDecision > max || playerDecision < 1){
                errorMessage = "Pick a number between 1 and " + max;
                continue;
            }
            choicesMessage = "";
            errorMessage = "";
            break;
        }
    }




    /** Return true if success false if failed, triggerChance point form */
    public static boolean QTE(double triggerChance){
        if (triggerChance > Math.random()){
            sc.nextLine();
            System.out.println("QTE CHANCE! PRESS ENTER ON SIGNAL!");
            for (int timer = 0; timer < Math.random()*10;timer++){
                wait(500);
                System.out.print("=");
            }
            System.out.print("NOW!!!");
            long minTimeMillis = System.currentTimeMillis() + 10;
            long maxTimeMillis = System.currentTimeMillis() + 1500;
            playerQTE = sc.nextLine();
            if (System.currentTimeMillis() < minTimeMillis){
                System.out.println("QTE Failed! Too early!");
                return false;
            }
            else if (System.currentTimeMillis() > maxTimeMillis) {
                System.out.println("QTE Failed! Too late!");
                return false;
            }
            System.out.println("QTE Success!");
            return true;
        }
        return false;
    }
    
    private static void wait(int ms){
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}

}