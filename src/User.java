import java.util.ArrayList;

public class User {
    static ArrayList userIDList = new ArrayList<String>();
    static ArrayList userNameList = new ArrayList<String>();
    static ArrayList userPassList = new ArrayList<String>();

    private String userID;
    private String userName;
    private String userPass;

    private int Playcount;
    ArrayList deck = new ArrayList<Pokemon>();

    public void GeneratePokemon(String name, int HP, int ATK, int DEF, int SPD, int SPE, char type, int movePower, Boolean moveIsSpecial){
        // TODO figure this part out thanks
    }
    
    public void AddPokemonIntoDeck(Pokemon pokemon){
        deck.add(pokemon);
    }

    public static ArrayList getUserIDList() {
        return userIDList;
    }

    public static void addUserIDList(String userID) {
        User.userIDList.add(userID);
    }

    public static ArrayList getUserNameList() {
        return userNameList;
    }

    public static void addUserNameList(String userName) {
        User.userNameList.add(userName)
    }

    public static ArrayList getUserPassList() {
        return userPassList;
    }

    public static void addUserPassList(String userPass) {
        User.userPassList.add(userPass)
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getPlaycount() {
        return Playcount;
    }

    public void setPlaycount(int playcount) {
        Playcount = playcount;
    }

    public ArrayList getDeck() {
        return deck;
    }

    public void setDeck(ArrayList deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", userPass=" + userPass + ", Playcount="
                + Playcount + ", deck=" + deck + "]";
    }

    
}
