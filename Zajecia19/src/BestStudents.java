import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BestStudents {

    static ArrayList<Student> listOfStudents = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner studentsFile = new Scanner(new File("uczniowie.txt"));
        Scanner markFile = new Scanner(new File("oceny.txt"));

        loadStudentsToList(studentsFile);
        sumMarksForEachStudent(markFile);
        Student[] bestStudents = findBestStudents();

        for (Student student : bestStudents) {
            System.out.println(student.getName() + " " + student.getLastname() + " " + student.countAverage());
        }
    }

    private static Student[] findBestStudents() {
        Student[] bestStudents = {listOfStudents.get(0), listOfStudents.get(1), listOfStudents.get(2)};
        for (int i = 3; i < listOfStudents.size(); i++) {
            if (listOfStudents.get(i).countAverage() > bestStudents[0].countAverage()) {
                bestStudents[2] = bestStudents[1];
                bestStudents[1] = bestStudents[0];
                bestStudents[0] = listOfStudents.get(i);
            } else if (listOfStudents.get(i).countAverage() > bestStudents[1].countAverage()) {
                bestStudents[2] = bestStudents[1];
                bestStudents[1] = listOfStudents.get(i);
            } else if ((listOfStudents.get(i).countAverage() > bestStudents[2].countAverage())) {
                bestStudents[2] = listOfStudents.get(i);
            }
        }
        return bestStudents;
    }

    private static void sumMarksForEachStudent(Scanner scanner) {
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] currentLine = scanner.nextLine().split(";");

            int studentId = Integer.parseInt(currentLine[0]);
            int mark = Integer.parseInt(currentLine[1]);
            int sumOfMarks = listOfStudents.get(studentId - 1).getSumOfMarks() + mark;
            int qtyOfMarks = listOfStudents.get(studentId - 1).getQtyOfMarks() + 1;

            listOfStudents.get(studentId - 1).setSumOfMarks(sumOfMarks);
            listOfStudents.get(studentId - 1).setQtyOfMarks(qtyOfMarks);
        }
    }

    private static void loadStudentsToList(Scanner scanner) {
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] currentLine = scanner.nextLine().split(";");
            listOfStudents.add(new Student(Integer.parseInt(currentLine[0]), currentLine[1], currentLine[2], currentLine[3], Integer.parseInt(currentLine[4]), currentLine[5]));
        }
    }
}
