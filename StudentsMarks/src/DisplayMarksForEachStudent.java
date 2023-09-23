import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplayMarksForEachStudent {
    static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String[]> students = loadStudentsData();
        String[] gradeList = readStudentsGrades(students);

        sc = new Scanner(System.in);
        System.out.print("Podaj imie i nazwisko studenta: ");
        String student = sc.nextLine();
        boolean studentOnList = false;
        for (int i = 0; i < students.size(); i++) {
            if ((students.get(i)[2] + " " + students.get(i)[1]).equals(student.trim())) {
                System.out.println(gradeList[i]);
                studentOnList = true;
                break;
            }
        }
        if (!studentOnList) {
            System.out.println("nie znaleziono studenta");
        }
    }

    private static String[] readStudentsGrades(ArrayList<String[]> students) throws FileNotFoundException {
        sc = new Scanner(new File("oceny.txt"));
        sc.nextLine();
        String[] grades = new String[students.size()];
        ArrayList<String[]> loadedDataFromFile = new ArrayList<>();
        while (sc.hasNextLine()) {
            loadedDataFromFile.add(sc.nextLine().split(";"));
        }
        for (int i = 0; i < students.size(); i++) {
            String marksCollector = "";
            for (String[] line : loadedDataFromFile) {
                if (students.get(i)[0].equals(line[0])) {
                    marksCollector += line[1] + ",";
                }
            }
            grades[i] = marksCollector.substring(0, marksCollector.length() - 1);
        }
        return grades;
    }

    private static ArrayList<String[]> loadStudentsData() throws FileNotFoundException {
        sc = new Scanner(new File("uczniowie.txt"));
        ArrayList<String[]> students = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            students.add(sc.nextLine().split(";"));
        }
        return students;
    }
}
