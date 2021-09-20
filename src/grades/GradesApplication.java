package grades;
import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        Student shelby = new Student("Shelby");

        shelby.addGrade(95);
        shelby.addGrade(100);
        shelby.addGrade(98);
//        System.out.println(shelby.getGradeAverage());

        Student bob = new Student("Bobera");
        bob.addGrade(55);
        bob.addGrade(78);
        bob.addGrade(89);

        Student joe = new Student("Joe");
        joe.addGrade(0);
        joe.addGrade(0);
        joe.addGrade(2);

        Student talia = new Student("Talia");
        talia.addGrade(100);
        talia.addGrade(78);
        talia.addGrade(90);

        System.out.printf("The student %s has a grade average of %.2f " + shelby.getName(), shelby.getGradeAverage());
    }
}
