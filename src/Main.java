import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static private String info = "                                  ,'\\\r\n" + //
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
                    "                                `'                            '-._|"; //TODO add more info
    static Scanner sc = new Scanner(System.in);
    static int playerDecision;
    static String choicesMessage = "";
    static String errorMessage = "";

    public static void main(String[] args) throws CloneNotSupportedException {
        PokemonPool.setPokemonRate(3, 2, 1);
        //Generate test user, remove by submission
        User dummy = new User("Ash Ketchump", "ash123"); 
        dummy.AddPokemonIntoDeck(new ElectricType("Pikachu",66, 35, 44, 43, 33, Move.THUNDERBOLT, 0.4));
        dummy.AddPokemonIntoDeck(new FireType("Charmander",66, 35, 44, 43, 33, Move.EMBER, 0.4));
        while (true) {
            User player = MainMenu();
            StartGame(player);
        }
    }

    public static User MainMenu() throws CloneNotSupportedException{
        String[] options = {"Continue","New","Leaderboard","Quit"};
        System.out.println(info);

            for(int choice = 1; choice <= options.length; choice++){
                choicesMessage += (choice + " : " + options[choice-1] + "\n");
            }
            choicesMessage += ("\n Choose an option!");
            validateSelection(1, options.length);

        sc.nextLine();
        //Player chooses Continue
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
                        return user;
                    }
                }
            }
            errorMessage = "No user found!";
            continue;
        }
        }

        //Player chooses New
        else if (playerDecision == 2){
            System.out.println("Creating a new account...");
            System.out.println("Enter a Username: ");
            String newUserName = sc.nextLine();
            System.out.println("Enter a Password: ");
            String newUserPass = sc.nextLine();
            
            User newUser = new User(newUserName, newUserPass);

            //Generating Starters
            ArrayList<Pokemon> starters =new ArrayList<>();
            starters.add(PokemonPool.referencePokemon());
            starters.add(PokemonPool.referencePokemon());
            starters.add(PokemonPool.referencePokemon());

            //Choose Starter 1
            for(int starter = 1; starter <= starters.size(); starter++){
                choicesMessage += (starter + " : " + starters.get(starter-1).getName() + '\n');
            }
            choicesMessage += ("\n Pick a starter!");
            validateSelection(1, starters.size());
            newUser.AddPokemonIntoDeck(starters.get(playerDecision-1).clone());
            starters.remove(playerDecision-1);

            //Choose Starter 2
            for(int starter = 1; starter <= starters.size(); starter++){
                choicesMessage += (starter + " : " + starters.get(starter-1).getName() + '\n');
            }
            choicesMessage += ("\n Pick a starter!");
            validateSelection(1, starters.size());
            newUser.AddPokemonIntoDeck(starters.get(playerDecision-1).clone());

            return newUser;
        }
        //Player chooses Leaderboard
        
        //Player chooses Quit
        else{
            return null;
        }
    }

    public static void StartGame(User player) throws CloneNotSupportedException{
        System.out.println("Starting game...");
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



}