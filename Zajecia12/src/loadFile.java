import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loadFile {
    public static void main(String[] args) throws FileNotFoundException {
        load();
    }

    private static void load() throws FileNotFoundException {
        File path = new File("anagram.txt");
        Scanner scanner = new Scanner(path);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
