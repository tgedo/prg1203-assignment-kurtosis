package com.kurtosis;
import java.io.*;
import java.util.ArrayList;

import com.kurtosis.pokemon.Pokemon;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 3549922165660595007L;
    
    public static ArrayList<User> userList = new ArrayList<User>();
    private static final String USERS_FILE = "users.ser";
    private int userID;
    private static int lastAssignedID = 0; // Static variable to keep track of the last assigned userID
    private String userName;
    private String userPass;
    private ArrayList<Pokemon> deck = new ArrayList<Pokemon>();

    public User(String userName, String userPass) throws IOException {
        this.userID = ++lastAssignedID; // Increment lastAssignedID and assign it to userID
        this.userName = userName;
        this.userPass = userPass;
        User.userList.add(this);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public ArrayList<Pokemon> getDeck() {
        return deck;
    }

    public void AddPokemonIntoDeck(Pokemon pokemon){
        deck.add(pokemon);
    }


    public static void serializeUser(User user, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(user);
            System.out.println("User serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static User deserializeUser(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User user = (User) in.readObject();
        in.close();
        fileIn.close();
        return user;
    }
    public static ArrayList<User> deserializeUsers(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                User deserializedUser = (User) objectInputStream.readObject();
                userList.add(deserializedUser);
            }
        } catch (EOFException e) {
            // Reached end of file
        }
        return userList;
    }




    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", deck=" + deck + "]";
    }

    
}
