import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        loadStudents();
        loadSubjects();
    }

    private static void loadSubjects() throws FileNotFoundException {
        sc = new Scanner(new File("przedmioty.txt"));
        sc.nextLine();
        ArrayList<Subject> subject = new ArrayList<>();
        while (sc.hasNextLine()){
            String[] actualLine = sc.nextLine().split(";");
            subject.add(new Subject(actualLine[0],
                    actualLine[1],
                    actualLine[2],
                    actualLine[3]));
            for (Student student : students){
                student.setSubject(subject);
            }
        }
    }

    private static void loadStudents() throws FileNotFoundException {
        sc = new Scanner(new File("uczniowie.txt"));

        sc.nextLine();
        while (sc.hasNextLine()){
            String[] actualLine = sc.nextLine().split(";");
            students.add(new Student(actualLine[0],actualLine[1],actualLine[2],actualLine[3],actualLine[4],actualLine[5]));
        }
    }
}
