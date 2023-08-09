public class Student {
    private String name;
    private int age;
    private double mark;
    private int actualClass;

    public Student(String name, int age, double mark, int actualClass) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.actualClass = actualClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getActualClass() {
        return actualClass;
    }

    public void setActualClass(int actualClass) {
        this.actualClass = actualClass;
    }

    @Override
    public String toString() {
        return name + '\'' +
                " " + age +
                " " + mark +
                " " + actualClass;
    }
}
