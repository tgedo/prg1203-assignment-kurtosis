import java.util.Scanner;

public class Main {
    private String info; //TODO add info
    Scanner sc = new Scanner(System.in);
    int playerDecision;

    public static void main(String[] args) {
        //create a new dummy user with manual id here cause code shit
        User dummy = new User(69000, "Your Mum", "Ash Ketchump")

    }

    public User MainMenu(){
        String[] options = {"Continue","New","Leaderboard","Quit"};
        String errorMessage = "";

        //TODO can actually make all these into a method
        while (true) {
            for(int choice = 1; choice < options.length; choice++){
            System.out.println(choice + " : " + options[choice-1]);
            System.out.println("\n Choose an option!");
            System.out.println(errorMessage);
        }
            playerDecision = sc.nextInt();
            if (playerDecision > options.length || playerDecision < 1){
                errorMessage = "Pick a number between 1 and " + options.length;
                continue;
            }
                break;
        }

        //Player chooses Continue
        while (true) {
            System.out.println("Enter a Username");
            String newUserName = sc.nextLine();
            System.out.println("Enter a Password");
            String newUserPass = sc.nextLine();
            
        }
        //TODO add login here

        if (playerDecision == 1){
            while (true) {
                for(int userIndex = 1; userIndex < User.userNameList.size(); userIndex++){
                System.out.println(userIndex + " : " + User.userNameList.get(userIndex-1));
                System.out.println("\n Choose an option!");
                System.out.println(errorMessage);
            }
                playerDecision = sc.nextInt();
                if (playerDecision > User.userNameList.size() || playerDecision < 1){
                    errorMessage = "Pick a number between 1 and " + User.userNameList.size();
                    continue;
                }
                    break;
            }
        }

        //Player chooses New
        else if (playerDecision == 2){
            System.out.println("Creating a new account...");
            System.out.println("Enter a Username");
            String newUserName = sc.nextLine();
            System.out.println("Enter a Password");
            String newUserPass = sc.nextLine();
            
            //generate a new user here idk how help pls
            
        }

        //Player chooses Leaderboard

        //Player chooses Quit

    }

}