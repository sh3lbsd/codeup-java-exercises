package grades;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }


    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double total = 0;
        for (int grade : grades) {
            total = total + grade;
        }
        double gradeAvg = total / grades.size();
        return gradeAvg;
    }
}
//    Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.