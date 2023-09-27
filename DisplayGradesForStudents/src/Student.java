import javax.security.auth.Subject;
import java.util.ArrayList;

public class Student {
    //IDucznia;nazwisko;imie;ulica;dom;IDklasy
    private String studentID;
    private String lastName;
    private String name;
    private String street;
    private String home;
    private String classID;
    private ArrayList<Subject> subject;

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                ", classID='" + classID +
                '}';
    }

    public Student(String studentID, String lastName, String name, String street, String home, String classID) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.name = name;
        this.street = street;
        this.home = home;
        this.classID = classID;
        this.subject = new ArrayList<Subject>();
    }

    public ArrayList<Subject> getSubject() {
        return subject;
    }
}
