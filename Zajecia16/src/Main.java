import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static int errors = 0;
    static int sum = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Operations2.txt"));
        addAllNumbersFromFile(sc);
        System.out.println("Ilość błędów: " + errors +
                "\nSuma cyfr: " + sum);
    }

    private static void addAllNumbersFromFile(Scanner sc) {
        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            if (x.charAt(0) >= 48 && x.charAt(0) <= 57) {
                sum += Integer.parseInt(x);
            } else {
                errors++;
            }
        }
    }
}