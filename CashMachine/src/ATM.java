import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accountList;
    private final String name;

    public ATM(String name) {
        this.name = name;
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
        start();
    }

    //This metod generating new account number
    private int newAcNumber() {
        if (!accountList.isEmpty()) {
            return accountList.get(accountList.size() - 1).getAcNumber() + 1;
        } else return 1000;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Witaj w naszym banku %s \n", this.name);
        System.out.print("""
                ****************************************
                Wybierz jaką operację chciałbyś wykonać:\s
                1. Utworzyć nowe konto.
                2. Wpłacić gotówkę.
                3. Wypłacić gotówkę.
                4. Sprawdzić bilans.
                ****************************************
                Twój wybór: """);

        int select = sc.nextInt();
        switch (select) {
            case 1:
                createNewAccount();

            case 2:
                deposit();
            case 3:

        }
    }

    private void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj kowtę wpłaty: ");
        double deposit = sc.nextDouble();
        Account loggedAccount = authorization();
        if(loggedAccount == null) {
            System.out.println("Podałeś błędne dane.");
            start();
        }else {
            balanceOperations(loggedAccount, deposit);
            start();
        }
    }

    private Account authorization() {
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

    private Account findAccount(int accNo) {
        for (Account acc : accountList) {
            if (acc.getAcNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    private void balanceOperations(Account account, double amount) {

        account.setAcBalance(account.getAcBalance() + amount);
        checkBalance(account);
    }

    private void checkBalance(Account account) {
        System.out.println("Aktualny stan konta to: " + account.getAcBalance());
    }
}
