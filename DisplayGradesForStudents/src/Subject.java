import java.util.ArrayList;

public class Subject {
    private String subjectID;
    private String name;
    private String teacherLastName;
    private String techerName;
    private ArrayList<Grade> grades;

    public Subject(String subjectID, String name, String teacherLastName, String techerName) {
        this.subjectID = subjectID;
        this.name = name;
        this.teacherLastName = teacherLastName;
        this.techerName = techerName;
        this.grades = new ArrayList<>();
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getTecherName() {
        return techerName;
    }

    public void setTecherName(String techerName) {
        this.techerName = techerName;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID='" + subjectID + '\'' +
                ", name='" + name + '\'' +
                ", teacherLastName='" + teacherLastName + '\'' +
                ", techerName='" + techerName +
                '}';
    }
}

