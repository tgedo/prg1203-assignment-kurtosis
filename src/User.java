import java.io.*;
import java.util.ArrayList;

//TODO update and read from .txt
public class User implements Serializable {
    public static ArrayList<User> userList = new ArrayList<User>();
    private static final String USERS_FILE = "users.ser";
    private int userID;
    private static int lastAssignedID = 0; // Static variable to keep track of the last assigned userID
    private String userName;
    private String userPass;
    private int Playcount = 0;
    private ArrayList<Pokemon> deck = new ArrayList<Pokemon>();

    public User(String userName, String userPass) throws IOException {
//        this.userID = ++lastAssignedID; // Increment lastAssignedID and assign it to userID
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

    public int getPlaycount() {
        return Playcount;
    }

    public void addPlaycount() {
        Playcount += 1;
    }

    public ArrayList<Pokemon> getDeck() {
        return deck;
    }

    public void AddPokemonIntoDeck(Pokemon pokemon){
        deck.add(pokemon);
    }

    /*public static void readUsersFromFile() throws IOException {
        FileReader fileReader = new FileReader("users.txt");

        int currentCharacter;
        StringBuilder lineBuilder = new StringBuilder();
        while ((currentCharacter = fileReader.read()) != -1) {
            char character = (char) currentCharacter;
            if (character == '\n') {
                // Process a complete line
                String line = lineBuilder.toString();
                String[] userData = line.split(",");
                String userName = userData[0];
                String userPass = userData[1];


                User user = new User(userName, userPass);
                userList.add(user);

                lineBuilder = new StringBuilder(); // Reset for the next line
            } else {
                lineBuilder.append(character);
            }
        }

        fileReader.close();
    }
    /*public void addNewUser(User user) throws IOException {
        User.writeUsersToFile();
        User.userList.add(user);
    }*/
    /*public static void writeUsersToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("users.txt");
        for (User user : userList) {
            fileWriter.write(user.getUserName() + "," + user.getUserPass() + "\n");
        }
        fileWriter.close();
    }*/



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
        return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", Playcount="
                + Playcount + ", deck=" + deck + "]";
    }

    
}
