package com.kurtosis.helper;
import java.util.Scanner;

import com.kurtosis.Main;
import com.kurtosis.constants.ConsoleColours;

public interface Helper {
    public static void validateSelection(int min,int max){
        while (true) {
            System.out.println(Main.choicesMessage);
            System.out.println(Main.errorMessage);
             try{
                Main.playerDecision = Main.sc.nextInt();
            } catch(Exception e){
                Main.errorMessage = "Choose an integer!";
                Main.sc.nextLine();
                
                continue;
            };
            if (Main.playerDecision > max || Main.playerDecision < 1){
                Main.errorMessage = "Pick a number between 1 and " + max;
                continue;
            }
            Main.choicesMessage = "";
            Main.errorMessage = "";
            break;
        }
    }

    /** Return true if success false if failed, triggerChance point form */
    public static boolean QTE(double triggerChance){
        if (triggerChance > Math.random()){
            Main.sc.nextLine();
            System.out.println(ConsoleColours.CYAN.text + "QTE CHANCE! PRESS ENTER ON SIGNAL!" + ConsoleColours.CYAN.text);
            countDown(500, true);
            System.out.print(ConsoleColours.YELLOW.text + "NOW!!!" + ConsoleColours.RESET.text);
            long minTimeMillis = System.currentTimeMillis() + 10;
            long maxTimeMillis = System.currentTimeMillis() + 1500;
            Main.playerQTE = Main.sc.nextLine();
            if (System.currentTimeMillis() < minTimeMillis){
                System.out.println(ConsoleColours.RED.text + "QTE Failed! Too early!" + ConsoleColours.RESET.text);
                return false;
            }
            else if (System.currentTimeMillis() > maxTimeMillis) {
                System.out.println(ConsoleColours.RED.text + "QTE Failed! Too late!" + ConsoleColours.RESET.text);
                return false;
            }
            System.out.println(ConsoleColours.GREEN.text + "QTE Success!" + ConsoleColours.RESET.text);
            return true;
        }
        return false;
    }
    
    public static void countDown(int delay,boolean random){
        if (random = true){
            for (int timer = 0; timer < Math.random()*10;timer++){
                wait(delay);
                System.out.print(ConsoleColours.RED.text + "=" + ConsoleColours.RESET.text);
            }
        }
        else{
            for (int timer = 0; timer < 10;timer++){
                wait(delay);
                System.out.print(ConsoleColours.RED.text + "=" + ConsoleColours.RESET.text);
            }
        }
    }

    public static void wait(int ms){
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}

    public static void checkExit(){
        int choice = 1;
        Scanner option = new Scanner(System.in);
        System.out.println("Enter 1 to return to main menu and 0 to stop playing.");
        choice = option.nextInt();
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
