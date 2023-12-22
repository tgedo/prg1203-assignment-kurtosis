package com.kurtosis.helper;

import com.kurtosis.Main;

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
            System.out.println("QTE CHANCE! PRESS ENTER ON SIGNAL!");
            countDown(500, true);
            System.out.print("NOW!!!");
            long minTimeMillis = System.currentTimeMillis() + 10;
            long maxTimeMillis = System.currentTimeMillis() + 1500;
            Main.playerQTE = Main.sc.nextLine();
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
    
    public static void countDown(int delay,boolean random){
        if (random = true){
            for (int timer = 0; timer < Math.random()*10;timer++){
                wait(delay);
                System.out.print("=");
            }
        }
        else{
            for (int timer = 0; timer < 10;timer++){
                wait(delay);
                System.out.print("=");
            }
        }
    }

    static void wait(int ms){
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
