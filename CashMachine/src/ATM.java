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

    public void createNewAccount(){
        Scanner sc = new Scanner(System.in);
        int newAcNumber = 1000;
        if (!accountList.isEmpty()){
            newAcNumber = accountList.get(accountList.size()-1).getAcNumber() + 1;
        }
        if (newAcNumber == -1){ newAcNumber++; }
        System.out.print("Utwórz Pin: ");
        int newPin = sc.nextInt();
        System.out.print("Kwota do wpłaty: ");
        double balance = sc.nextDouble();
        accountList.add(new Account(newAcNumber,newPin,balance));
        System.out.println("Twoje konto zostało utworzone. Numer twojego konta to: " + newAcNumber);

    }
}
