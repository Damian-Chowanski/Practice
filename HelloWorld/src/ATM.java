import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> usersAccountsList;
    private String name;

    public ATM(String name) {
        this.name = name;
        usersAccountsList = new ArrayList<>();
    }

    public ArrayList<Account> getUsersAccountsList() {
        return usersAccountsList;
    }

    public void setUsersAccountsList(ArrayList<Account> usersAccountsList) {
        this.usersAccountsList = usersAccountsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
