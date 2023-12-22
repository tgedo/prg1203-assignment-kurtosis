package com.kurtosis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.helper.Helper;
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
    public static Scanner sc = new Scanner(System.in);
    public static int playerDecision;
    public static String playerQTE;
    public static String choicesMessage = "";
    public static String errorMessage = "";

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
        Helper.validateSelection(1, options.length);

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
            chooseStarter(starters, newUser);
            starters.remove(playerDecision - 1);
            //Choose Starter 2
            chooseStarter(starters, newUser);
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

    private static void chooseStarter(ArrayList<Pokemon> starters, User newUser) throws CloneNotSupportedException{
        for (int starter = 1; starter <= starters.size(); starter++) {
                choicesMessage += (starter + " : " + starters.get(starter - 1).getName() + '\n');
            }
            choicesMessage += ("\n Pick a starter!");
            Helper.validateSelection(1, starters.size());
            newUser.AddPokemonIntoDeck(starters.get(playerDecision - 1).clone());
    }

    public static void StartGame(User player) throws CloneNotSupportedException{
        new Battle(player, PokemonPool.referencePokemon().clone(), PokemonPool.referencePokemon().clone());
    };

    
}