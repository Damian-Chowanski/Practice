public class Student {
    private int ID;
    private String lastname;
    private String name;
    private String street;
    private int home;
    private String classID;

    public Student(int ID, String lastname, String name, String street, int home, String classID) {
        this.ID = ID;
        this.lastname = lastname;
        this.name = name;
        this.street = street;
        this.home = home;
        this.classID = classID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", classID='" + classID + '\'' +
                '}';
    }
}
