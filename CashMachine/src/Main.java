import java.util.Scanner;

public class Main {
    static boolean isRun = true;
    public static void main(String[] args) {
        ATM test = new ATM("Moj Bank");
        while (isRun){
            initializeBank(test);
        }

        System.out.println("Koniec");
    }

    private static boolean initializeBank(ATM cashmachine) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Witaj w naszym banku %s \n", cashmachine.getName());
        System.out.print("""
                ****************************************
                Wybierz jaką operację chciałbyś wykonać:\s
                1. Utworzyć nowe konto.
                2. Wpłacić gotówkę.
                3. Wypłacić gotówkę.
                4. Sprawdzić bilans.
                0. Ładnie się pożegnaj.
                ****************************************
                Twój wybór:\s""");

        int select = sc.nextInt();
        switch (select) {
            case 1 -> cashmachine.createNewAccount();
            case 2 -> cashmachine.deposit();
            case 3 -> cashmachine.withdrawal();
            case 4 -> {
                Account account = cashmachine.authorization();
                cashmachine.checkBalance(account);
                initializeBank(cashmachine);
            }
            default -> { isRun = false;
            }
        }return isRun;
    }
}

