import java.util.ArrayList;
import java.util.Arrays;

public class Komis {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        Student a = new Student("Karol",15,5.0,3);
        Student b = new Student("Ewelina",14,4.5,1);
        Student c = new Student("Józek",11,3.5,0);

        students.add(a);
        students.add(b);
        students.add(c);

        for (Student student: students) {
            System.out.println(student.getName());
        }
    }
}
