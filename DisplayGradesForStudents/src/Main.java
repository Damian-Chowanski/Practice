import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner scanner;
    static ArrayList<Student> listOfStudents = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        loadStudents();
        loadSubjects();
        loadGrades();
        //displayGrades();
        //displayStudentsSubjectsWhithoutGradeOne();
        displayTeacherWithHighestNumberOfF();
    }

    private static void displayTeacherWithHighestNumberOfF() {
        ArrayList<String> percentOfMarkF = new ArrayList<>();
        double[] sumOfGrades = new double[listOfStudents.get(0).getListOfSubjects().size()];
        double[] sumOfMarkF = new double[listOfStudents.get(0).getListOfSubjects().size()];

        for (int i = 0; i < sumOfGrades.length; i++) {
            sumOfMarkF[i] = 0;
            sumOfGrades[i] = 0;
        }

        for (Student student : listOfStudents) {
            ArrayList<Subject> subjects = student.getListOfSubjects();
            for (int i = 0; i < subjects.size(); i++) {
                ArrayList<Grade> grades = subjects.get(i).getListOfGrades();
                for (Grade grade : grades) {
                    if (grade.getGrade().equals("1")) {
                        sumOfGrades[i] += 1;
                        sumOfMarkF[i] += 1;
                    } else sumOfGrades[i] += 1;
                }
            }
        }
        for (int i =0; i < sumOfGrades.length; i++){
            percentOfMarkF.add(String.format("%.2f",sumOfGrades[i]/sumOfMarkF[i])  + "% " +
                    listOfStudents.get(0).getListOfSubjects().get(i).getTecherName() + " " +
                    listOfStudents.get(0).getListOfSubjects().get(i).getTeacherLastName() +
                    " ilość wystawionych ocen: " + sumOfGrades[7] + " " + sumOfMarkF[7]);
        }

        Collections.sort(percentOfMarkF);
        for (int i = 1; i < 4; i++) {
            System.out.println(percentOfMarkF.get(percentOfMarkF.size()-i));
        }

        /*for (int i = 0; i < sumOfGrades.length; i++) {
            System.out.println(listOfStudents.get(0).getListOfSubjects().get(i).getName() + " " +
                    sumOfGrades[i] + " " + sumOfMarkF[i] + " " + (sumOfGrades[i]/sumOfMarkF[i]));
        }*/

    }

    private static void displayStudentsSubjectsWhithoutGradeOne() {
        for (Student student : listOfStudents) {
            System.out.println(student.getName() + " " + student.getLastName());
            ArrayList<Subject> subjects = student.getListOfSubjects();

            for (Subject subject : subjects) {
                boolean isGradeOne = false;
                if (!(subject.getListOfGrades().isEmpty())) {
                    ArrayList<Grade> grades = subject.getListOfGrades();
                    for (Grade grade : grades) {
                        if (grade.getGrade().equals("1")) {
                            isGradeOne = true;
                            break;
                        }
                    }
                } else {
                    isGradeOne = true;
                }

                if (!isGradeOne) {
                    System.out.println("    " + subject.getName() + ": ");
                    System.out.print("      ");
                    for (Grade x : subject.getListOfGrades()) System.out.print(x.getGrade() + " ");
                    System.out.println();
                }
            }
            System.out.println();

        }
    }

    private static void displayGrades() {
        for (Student student : listOfStudents) {
            System.out.println(student.getName() + " " + student.getLastName());
            ArrayList<Subject> subjects = student.getListOfSubjects();
            for (Subject subject : subjects) {
                System.out.println("  " + subject.getName() + ": ");
                System.out.print("    ");
                ArrayList<Grade> grades = subject.getListOfGrades();
                for (Grade grade : grades) {
                    System.out.print(grade.getGrade() + " ");
                }
                System.out.println();
            }
        }
    }

    private static void loadGrades() throws FileNotFoundException {
        scanner = new Scanner(new File("oceny.txt"));
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String[] loadedLine = scanner.nextLine().split(";");
            Student actualStudent = listOfStudents.get(Integer.parseInt(loadedLine[0]) - 1);
            Subject actualSubject = actualStudent.getListOfSubjects().get(Integer.parseInt(loadedLine[3]) - 1);
            actualSubject.getListOfGrades().add(new Grade(loadedLine[1], loadedLine[2]));
        }
    }

    private static void loadSubjects() throws FileNotFoundException {
        scanner = new Scanner(new File("przedmioty.txt"));
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String[] actualLine = scanner.nextLine().split(";");
            for (Student student : listOfStudents) {
                student.getListOfSubjects().add(new Subject(actualLine[0],
                        actualLine[1],
                        actualLine[2],
                        actualLine[3]));
            }
        }
    }

    private static void loadStudents() throws FileNotFoundException {
        scanner = new Scanner(new File("uczniowie.txt"));
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String[] actualLine = scanner.nextLine().split(";");
            listOfStudents.add(new Student(actualLine[0],
                    actualLine[1],
                    actualLine[2],
                    actualLine[3],
                    actualLine[4],
                    actualLine[5]));
        }
    }
}
