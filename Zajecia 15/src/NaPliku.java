import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NaPliku {
    static String text = "";
    static String[] splitedIntoLetters;
    public static void main(String[] args) throws FileNotFoundException {

        loadFileToString();

        splitedIntoLetters = text.split("");
        int qtyOfLetterP = countLetters("P");
        int qtyOfLetterJ = countLetters("J");

        System.out.println("Ilość wystąpień liczby \"P\" " + qtyOfLetterP +
                "\nIlość wystąpień litery \"J\": " + qtyOfLetterJ);
    }
    private static void loadFileToString() throws FileNotFoundException {
        File path = new File("HiddenJavaLetters.txt");
        Scanner sc = new Scanner(path);
        while (sc.hasNextLine()) {
            text += sc.nextLine();
        }
    }
    private static int countLetters(String letter) {
        int result = 0;
        for (String j : splitedIntoLetters) {
            if (j.equals(letter)) {
                result++;
            }
        }
        return result;
    }
}
