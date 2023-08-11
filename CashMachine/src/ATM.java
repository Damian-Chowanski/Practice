import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accountList;
    private final String name;

    public ATM(String name) {
        this.name = name;
        accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
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

    //Funkcja pozwala na wypłatę gotówki
    void withdrawal() {
        Scanner sc = new Scanner(System.in);
        Account loggedAccount = authorization();
        if (loggedAccount == null) {
            System.out.println("Podałeś błędne dane.");
        } else {
            System.out.print("Podaj kowtę wpłaty: ");
            double deposit = sc.nextDouble() * (-1);
            balanceOperations(loggedAccount, deposit);
        }
    }

    // Funkcja pozwala wpłatę gotówki na konto
    void deposit() {
        Scanner sc = new Scanner(System.in);
        Account loggedAccount = authorization();
        if (loggedAccount == null) {
            System.out.println("Podałeś błędne dane.");
        } else {
            System.out.print("Podaj kowtę wpłaty: ");
            double deposit = sc.nextDouble();
            balanceOperations(loggedAccount, deposit);
        }
    }

    //Funkcja loguje użykownika do jego konta
    Account authorization() {
        Account account;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj numer konta");
        account = findAccount(sc.nextInt());
        if (account != null) {
            System.out.print("Podaj PIN do swojego konta: ");
            int pin = sc.nextInt();

            if (pin != account.getAcPIN()) {
                System.out.println("ACC pin: " + account.getAcPIN());
                System.out.println("PIN:" + pin);
                account = null;
            }
        }
        return account;
    }

    //Funkcja wyszukuje czy istnieje konto w tym banku
    private Account findAccount(int accNo) {
        for (Account acc : accountList) {
            if (acc.getAcNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    //Funkcja pozwala na operacje gotówkowe na koncie
    private void balanceOperations(Account account, double amount) {
        if (account.getAcBalance() + amount < 0) {
            System.out.println("Nie posiadasz takiej ilości gotówki na koncie");
        } else {
            account.setAcBalance(account.getAcBalance() + amount);
        }
        checkBalance(account);
    }

    //Funkcja sprawdza aktualny bilans na koncie
    void checkBalance(Account account) {
        System.out.println("Aktualny stan twojego konta to: " + account.getAcBalance());
    }
}
