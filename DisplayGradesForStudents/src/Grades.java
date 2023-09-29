public class Grades {
    //IDucznia;Ocena;Data;IDprzedmiotu
    private String grade;
    private String date;

    public Grades(String grade, String date) {
        this.grade = grade;
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
