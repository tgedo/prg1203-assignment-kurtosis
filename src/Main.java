import java.util.Scanner;

public class Main {
    private String info; //TODO add info
    Scanner sc = new Scanner(System.in);
    int playerDecision;

    public static void main(String[] args) {

    }

    public User MainMenu(){
        String[] options = {"Continue","New","Leaderboard","Quit"};
        String errorMessage = "";

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
        if (playerDecision == 1){
            for(int userIndex = 1; userIndex < User.userNameList; userIndex++){
                
            }
        }

        //Player chooses New

        //Player chooses Leaderboard

        //Player chooses Quit

    }

}