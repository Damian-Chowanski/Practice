import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> peselNumbers = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("pesel.txt"));
        Scanner sc = new Scanner(System.in);

        readFileToList(readFile);
        System.out.print("Podaj swój miesiąc urodzenia w formacie dwóch cyfr [01-12]: ");
        String month = sc.next();

        checkPopulationInSelectedMonth(month);

    }

    private static void checkPopulationInSelectedMonth(String month) {
        int women = 0;
        int men = 0;

        for (String pesel : peselNumbers) {
            if (pesel.substring(2, 4).equals(month)) {
                if (pesel.charAt((pesel.length()-1)) % 2 == 0) {
                    women++;
                } else men++;
            }
        }
        System.out.println("W twoim miesiącu urodziło się " + women + " kobiet i " + men + " mężczyżn.");
    }

    private static void readFileToList(Scanner sc) {

        while (sc.hasNextLine()) {
            peselNumbers.add(sc.nextLine());
        }
    }
}