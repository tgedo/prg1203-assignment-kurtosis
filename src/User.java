import java.util.ArrayList;

public class User {
    public static ArrayList<User> userList = new ArrayList<User>();

    private int userID;
    private static int lastAssignedID = 0; // Static variable to keep track of the last assigned userID
    private String userName;
    private String userPass;
    private int Playcount = 0;
    private ArrayList<Pokemon> deck = new ArrayList<Pokemon>();

    public User(String userName, String userPass) {
        this.userID = ++lastAssignedID; // Increment lastAssignedID and assign it to userID
        this.userName = userName;
        this.userPass = userPass;
        User.userList.add(this);
    }

    public int getUserID() {
        return userID;
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

    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", Playcount="
                + Playcount + ", deck=" + deck + "]";
    }

    
}
