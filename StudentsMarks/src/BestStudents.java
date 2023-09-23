import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BestStudents {
    static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String[]> students = loadStudentsData();
        ArrayList<String> avarages = countAvarages("oceny.txt", students);
        Collections.sort(avarages);

        for (int i = 1; i < 4; i++) {
            System.out.println(avarages.get(avarages.size()-i));
        }
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

    private static ArrayList<String> countAvarages(String file, ArrayList<String[]> students) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        sc.nextLine();
        ArrayList<String[]> loadedLinesFromFile = new ArrayList<>();
        ArrayList<String> avarages = new ArrayList<>();
        while (sc.hasNextLine()) {
            loadedLinesFromFile.add(sc.nextLine().split(";"));
        }

        for (String[] student : students) {
            double sumOfDegrees = 0;
            int qtyOfGrades = 0;
            for (String[] marks : loadedLinesFromFile) {
                if (student[0].equals(marks[0])) {
                    sumOfDegrees += Double.parseDouble(marks[1]);
                    qtyOfGrades++;
                }
            }
            avarages.add(sumOfDegrees / qtyOfGrades + " " + student[2] + " " + student[1]);
        }
        return avarages;
    }
}