package com.kurtosis.leaderboard;
import java.util.*;

public class Leaderboard{
    public static ArrayList<Leaderboard> userScores = new ArrayList<Leaderboard>();
    private int scores = 0;
    private String username;

    public Leaderboard(String username, int scores) {
        this.username = username;
        this.scores = scores;
        Leaderboard.userScores.add(this);
    }

    public int getScores() {
        return scores;
    }

    public String getUsername() {
        return username;
    }

    public static void displayLeaderboard() {
        System.out.println("Top 5 Highest Scores:");

        // Sort userScores based on battleScore in descending order
        userScores.sort(Comparator.comparingInt(Leaderboard::getScores).reversed());

        // Display only the top 5 scores
        int count = 0;
        for (Leaderboard userScore : userScores) {
            System.out.println(userScore.getUsername() + ": " + userScore.getScores());
            count++;
            if (count == 5) {
                break;
            }
        }
        
        Scanner option = new Scanner(System.in);
        int choice = option.nextInt();

        if (choice == 0){
            System.exit(0);
        } 
        else if (choice == 1) {
            ;
        }
        else{
            System.out.println("Enter '0' or '1' only.");
        }

        
    }

}


