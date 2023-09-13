import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HistogramDamian {
    static File path = new File("Histogram.txt");
    static int numberOfLetters = 0;
    static int numberOfLines = 0;
    static int numberOfSentences = 0;
    static int numberOfWords = 0;
    /*
    W przesłanym pliku każda linia kończy się kropką co ułatwia zczytywanie skanerem zdań,
    dlatego zakładając że mogłoby być inaczej, szukałem rozwiązania które to uwzględni.
    Najszybszy pomysł jaki mi wpadł do głowy to utworzenie zmiennej String "wholeTextFromFile". Będzie przechowywać cały tekst,
    dzięki czemu będę go mógł dzielić splitem bez względu na to czy kropka jest w kolejnej linii, czy kończy aktualnie zczytaną.
    Jeśli jest bardziej efektywny sposób to chętnie poznam :)
    */
    static String wholeTextFromFile = "";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(path);

        readTheFileToString(sc); //Zczytuje pliku do zmiennej String "wholeTextFromFile" i zlicza ilość linii
        countSenteces();
        countWords();
        countLetters();
        System.out.println("Ilość linii w pliku: " + numberOfLines + "\n" +
                "Ilość zdań w pliku: " + numberOfSentences + "\n" +
                "Ilość wyrazów: " + numberOfWords + "\n" +
                "Ilość liter: " + numberOfLetters + "\n");

    }

    private static void countSenteces() {
        numberOfSentences = wholeTextFromFile.trim().split("[.!?]").length;
    }

    private static void countWords() {

        String[] tabOfWords = wholeTextFromFile.trim().split("[ \n]");
        numberOfWords = tabOfWords.length;

        for (String word : tabOfWords) {
            if (word.equals("–")) {
                numberOfWords--;
            }
        }
    }

    private static void countLetters() {
        char[] letters = wholeTextFromFile.toCharArray();

        for (char isLetter : letters) {
            if ((isLetter >= 'A' && isLetter <= 'Z') || (isLetter >= 'a' && isLetter <= 'z') || checkPolishCharacter(isLetter)) {
                numberOfLetters++;
            }
        }
    }

    //Poniższa funkcja ma sprawdzić czy w wyrazie znajdują się polskie litery
    private static boolean checkPolishCharacter(char letter) {
        char[] tabOfPolishCharacters = {'ą', 'ć', 'ę', 'ł', 'ń', 'ó', 'ś', 'ź', 'ż'};
        for (char x : tabOfPolishCharacters) {
            if (x == letter) return true;
        }
        return false;
    }

    private static void readTheFileToString(Scanner sc) {
        String lineFromFile = "";
        while (sc.hasNextLine()) {
            numberOfLines++;
            lineFromFile = sc.nextLine();

            if (lineFromFile != "") wholeTextFromFile += lineFromFile + "\n";
        }
    }
}
