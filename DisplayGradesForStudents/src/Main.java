import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        loadStudents();
        loadSubjects();
        loadGrades();
        ArrayList<Grade> grade2 = students.get(413).getSubject().get(0).getGrades();


        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getLastName());
            for (int i =0; i<student.getSubject().size(); i++){
                System.out.println("  " + student.getSubject().get(i).getName() + ": ");
                System.out.print("    ");
                for (int j=0; j< student.getSubject().get(i).getGrades().size(); j++){
                    System.out.print(student.getSubject().get(i).getGrades().get(j).getGrade() + " ");
                }
                System.out.println();
            }

        }

        /*for (Student student: students){
            System.out.println(student.getName() + student.getLastName());
            for (Subject subject: student.getSubject()){
                System.out.println("    " + subject.getName() + ": ");
                System.out.print("      ");
                for (Grade grade: subject.getGrades()){
                    System.out.print(grade.getGrade() + " " + grade.getDate());
                }
                System.out.println();
            }
        }*/
    }

    private static void loadGrades() throws FileNotFoundException {
        sc = new Scanner(new File("oceny.txt"));
        sc.nextLine();
        while (sc.hasNextLine()){
            String[] loadedLine = sc.nextLine().split(";");
            Student actualStudent = students.get(Integer.parseInt(loadedLine[0])-1);
            Subject actualSubject = actualStudent.getSubject().get(Integer.parseInt(loadedLine[3])-1);
            actualSubject.getGrades().add(new Grade(loadedLine[1],loadedLine[2]));
        }
    }

    private static void loadSubjects() throws FileNotFoundException {
        sc = new Scanner(new File("przedmioty.txt"));
        sc.nextLine();
        while (sc.hasNextLine()){
            String[] actualLine = sc.nextLine().split(";");
            for (Student student : students){
                student.getSubject().add(new Subject(actualLine[0],
                        actualLine[1],
                        actualLine[2],
                        actualLine[3]));
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
