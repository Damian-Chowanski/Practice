import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    static Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String[]> students = loadStudentsData("uczniowie.txt");
        ArrayList<String> avarages = loadAvarages("oceny.txt", students);
        Collections.sort(avarages);

        for (int i = 1; i < 4; i++) {
            System.out.println(avarages.get(avarages.size()-i));
        }
    }

    private static ArrayList<String[]> loadStudentsData(String file) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        ArrayList<String[]> students = new ArrayList<>();
        sc.nextLine();
        while (sc.hasNextLine()) {
            students.add(sc.nextLine().split(";"));
        }
        return students;
    }

    private static ArrayList<String> loadAvarages(String file, ArrayList<String[]> students) throws FileNotFoundException {
        sc = new Scanner(new File(file));
        sc.nextLine();
        ArrayList<String[]> loadedData = new ArrayList<>();
        ArrayList<String> avarages = new ArrayList<>();
        while (sc.hasNextLine()) {
            loadedData.add(sc.nextLine().split(";"));
        }

        for (String[] student : students) {
            double sumOfMarks = 0;
            int qtyOfMarks = 0;
            for (String[] marks : loadedData) {
                if (student[0].equals(marks[0])) {
                    sumOfMarks += Double.parseDouble(marks[1]);
                    qtyOfMarks++;
                }
            }
            avarages.add(sumOfMarks / qtyOfMarks + " " + student[2] + " " + student[1]);
        }
        return avarages;
    }
}