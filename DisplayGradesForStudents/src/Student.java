import java.util.ArrayList;

public class Student {
    private String studentID;
    private String lastName;
    private String name;
    private String street;
    private String home;
    private String classID;
    private ArrayList<Subject> listOfSubjects;

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
        this.listOfSubjects = new ArrayList<Subject>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public ArrayList<Subject> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(ArrayList<Subject> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
