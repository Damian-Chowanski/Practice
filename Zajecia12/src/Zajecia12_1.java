import java.util.Random;
import java.util.Scanner;

public class Zajecia12_1 {
    static Scanner sc = new Scanner(System.in);
    static int userNumber = 0;
    static int number = 0;
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        generateNumber();
        System.out.println("Wylosowałem dla Ciebie liczbę z zakresu 0-10");
        System.out.print("Zgadnij co to za liczba");
        askUser();

        while (!checkIfCorrect()){
            System.out.println("Sprobuj ponownie");
            askUser();
        }
        System.out.println("Gratulacje! odgadłeś moją liczbę! " + number);
        System.out.println("""
                Chcesz zagrać jeszcze raz?\s
                 1. Podejmuje wyzwanie.
                 2. Mam już dość.
                 Wybór:\s""");
        int selected = sc.nextInt();
        if (selected == 1){
            game();
        }
        else System.out.println("Do zobaczenia ;)");
    }

    private static boolean checkIfCorrect() {
        return number == userNumber;
    }

    private static void askUser() {
        System.out.println("Podaj liczbę: ");
        userNumber = sc.nextInt();
    }

    private static void generateNumber() {
        Random rand = new Random();
        number = rand.nextInt(0,11);
    }
}
