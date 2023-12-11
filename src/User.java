import java.util.ArrayList;

public class User {
    static ArrayList<Integer> userIDList = new ArrayList<Integer>();
    static ArrayList<String> userNameList = new ArrayList<String>();
    static ArrayList<String> userPassList = new ArrayList<String>();

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
        userIDList.add(this.userID);
        userNameList.add(this.userName);
        userPassList.add(this.userPass);
    }

    public Pokemon GeneratePokemon(String name, int HP, int ATK, int DEF, int SPD, int SPE, String type, int movePower, Boolean moveIsSpecial){
        Pokemon generatedPokemon = new Pokemon();
        return generatedPokemon;
    }

    public static ArrayList<Integer> getUserIDList() {
        return userIDList;
    }

    public static void addUserIDList(int userID) {
        User.userIDList.add(userID);
    }

    public static ArrayList<String> getUserNameList() {
        return userNameList;
    }

    public static void addUserNameList(String userName) {
        User.userNameList.add(userName);
    }

    public static ArrayList<String> getUserPassList() {
        return userPassList;
    }

    public static void addUserPassList(String userPass) {
        User.userPassList.add(userPass);
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
