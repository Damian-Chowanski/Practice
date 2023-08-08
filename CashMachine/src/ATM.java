import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accountList;

    public ATM() {
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public void createNewAccount() {

        Scanner sc = new Scanner(System.in);
        int acNumber = newAcNumber();
        System.out.print("Utwórz Pin: ");
        int newPin = sc.nextInt();
        accountList.add(new Account(acNumber, newPin, 0.0));
        System.out.println("Twoje konto zostało utworzone. Numer twojego konta to: " + acNumber);

    }

    //This metod generating new account number
    private int newAcNumber() {
        if (!accountList.isEmpty()) {
            return accountList.get(accountList.size() - 1).getAcNumber() + 1;
        } else return 1000;
    }
}
