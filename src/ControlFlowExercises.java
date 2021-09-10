import java.util.Scanner;
//NOT FINISHED
public class ControlFlowExercises {
        public static void main(String[] args) {
//==============mini exercise===============
//            write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.
//            if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
//            Write each program in a separate class

////                Create an integer variable i with a value of 5.
//        long i = 5;
//////                Create a while loop that runs so long as i is less than or equal to 15
//////                Each loop iteration, output the current value of i, then increment i by one.
//                while (i <= 15) {
//            System.out.println(i++);
//        }
//////        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//
//        } while (i < 1000000);
//////                Alter your loop to count backwards by 5's from 100 to -10.
//        for (int x =100; x >= -10; x--) {
//            System.out.println(x);
//            x-=5;
//        }
//        for (long i =2; i < 1000000; i++) {
//              System.out.println(i);
//              i*=i;
//          }
////      Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//                need help with this one




//  Fizzbuzz
//
//  One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//  Write a program that prints the numbers from 1 to 100.
//        int i = 1;
//        while(i < 100) {
//            if(i % 15 == 0 ){
//                System.out.println("FizzBuzz " + i);
//            }
//            else if(i % 5 == 0) {
//                System.out.println("Buzz " + i);
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz " + i);
//            }
//        i++;
//        }
//  For multiples of three: print “Fizz” instead of the number.
//  For the multiples of five: print “Buzz”.
//  For numbers which are multiples of both three and five: print “FizzBuzz”.



////                Display a table of powers.
//        int i = 0;
//        int userInput2 = 0;
//        do {
//            System.out.println("Please enter a number");
//            int userInput = scanner.nextInt();
//            System.out.println("");
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
////
//            for (i = 1; i <= userInput; i++)
//                System.out.println("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
//            System.out.println("Would you like to continue?");
//
//            userInput2 = scanner.nextInt();
//            if (userInput2 == "yes") {
//
//            };
//        } while (userInput2 != "no");
//        System.out.println("Thank you for playing");
//                Ask if the user wants to continue.
//                Assume that the user will enter valid data.
//                Only continue if the user agrees to.
//                Example Output


//                Convert given number grades into letter grades.
//
//                        Prompt the user for a numerical grade from 0 to 100.
//                Display the corresponding letter grade.
//                        Prompt the user to continue.
//                Assume that the user will enter valid integers for the grades.
//                The application should only continue if the user agrees to.
//                Grade Ranges:
//
//                A : 100 - 88
//                B : 87 - 80
//                C : 79 - 67
//                D : 66 - 60
//                F : 59 - 0

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a grade: ");
                int testScore = scanner.nextInt();

                if (testScore >= 90) {

                        System.out.println("A");

                } else if (testScore >= 80) {

                        System.out.println("B");

                } else if (testScore >= 70) {

                        System.out.println("C");

                } else if (testScore >= 60) {

                        System.out.println("D");

                } else {

                        System.out.println("F");

                }
//            WARM UP
//      Create a class called myTherapist
//      It should ask you how you are doing today?
//      Based on your response, it should give you some sort of advice.
//        }
        }
}
