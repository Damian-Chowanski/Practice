import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BestStudents {

    static ArrayList<Student> listOfStudents = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner studentsFile = new Scanner(new File("uczniowie.txt"));
        Scanner markFile = new Scanner(new File("oceny.txt"));

        loadStudentsToList(studentsFile);


    }

    private static void loadStudentsToList(Scanner scanner) {
        scanner.nextLine();
        while (scanner.hasNextLine()){
            String[] currentLine = scanner.nextLine().split(";");
            listOfStudents.add(new Student(Integer.parseInt(currentLine[0]),currentLine[1],currentLine[2],currentLine[3],Integer.parseInt(currentLine[4]),currentLine[5]));
        }
    }
}
