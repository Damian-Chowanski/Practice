import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {
    static File path = new File("Histogram.txt");
    static int numberOfLetters = 0;
    static int numberOfLines = 0;
    static int numberOfSentences = 0;
    static int numberOfWords = 0;
    /*W przesłanym pliku każda linia kończy się kropką co ułatwia zczytywanie skanerem zdań,
    dlatego zakładając że powiesz "a co gdyby tak nie było", szukałem do tego rozwiązania.
    Najszybszy pomysł jaki mi wpadł do głowy to utworzenie zmiennej String "wholeTextFromFile". Będzie przechowywać cały tekst,
    dzięki czemu będę go mógł dzielić Splitem bez względu na to czy kropka jest w nowej linii, czy kończy aktualnie zczytaną.
    Jeśli jest bardziej efektywny sposób to chętnie poznam :)
    */
    static String wholeTextFromFile = "";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(path);

        readTheFileToString(sc); //Zczytuje pliku do zmiennej String "wholeTextFromFile" i zlicza ilość linii

    }

    private static void readTheFileToString(Scanner sc) {

        while (sc.hasNextLine()) {
            numberOfLines++;
            wholeTextFromFile += sc.nextLine() + "\n";
        }
    }
}
