package grades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        // key is the 'string' and the value is the 'student' class
        HashMap <String, Student> students = new HashMap<>();

        Student shelby = new Student("Shelby");
        shelby.addGrade(95);
        shelby.addGrade(100);
        shelby.addGrade(98);
        students.put("shelbyswag69", shelby);


//        System.out.println(shelby.getGradeAverage());

        Student bob = new Student("Bobera");
        bob.addGrade(55);
        bob.addGrade(78);
        bob.addGrade(89);
        students.put("brabra111", bob);

        Student joe = new Student("Joe");
        joe.addGrade(0);
        joe.addGrade(0);
        joe.addGrade(2);
        students.put("stinkyhed25", joe);

        Student talia = new Student("Talia");
        talia.addGrade(100);
        talia.addGrade(78);
        talia.addGrade(90);
        // put the student 'talia' in the HashMap for the key 'fairlygirl45'
        students.put("fairygirl45", talia);
//        System.out.printf("The student %s has a grade average of %.2f \n", shelby.getName(), shelby.getGradeAverage());
        infoPrompt(students);
    }

    public static void infoPrompt(HashMap <String, Student> students) {
        // for each username in the set of keys in students
        for (String userName : students.keySet()) {
            System.out.println(userName);
        }
        System.out.println("Which user would you like to know more about?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        // anything you put in a try block, java will attempt to run
        // if any errors are thrown, the catch block will be executed
        try {
            // gets the student from our map using the user input
            Student selectedStudent = students.get(input);
            System.out.printf("The student %s has a grade average of %.2f \n", selectedStudent.getName(), selectedStudent.getGradeAverage());
            System.out.println("Would you like to know about another user? Answer 'y' or 'n'");
        // if any exception is caught do this
        } catch(Exception e) {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", input);
            infoPrompt(students);
        }
        input = scanner.next();
        // (recursion) if the input equals 'y', we call the function again
        // if it's not 'y' it doesn't do anything and exits the code
        if (input.equalsIgnoreCase("y")) {
            infoPrompt(students);
        }
    }
}
