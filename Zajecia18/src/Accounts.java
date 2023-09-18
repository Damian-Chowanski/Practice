import java.util.ArrayList;

public class Accounts {
    private ArrayList<User> usersList;

    public Accounts() {
        usersList = new ArrayList<>();
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }
}
