import java.util.Scanner;

public class ControlFlowExercises {
        public static void main(String[] args) {
//==============mini exercise===============
//            write a short Java program that tests if a number is positive or negative. Define a few numeric variables and run them through a decision. If the number is positive, output that it is positive, and if it is negative, output that it is negative.
//            if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
//            Write each program in a separate class

//                Create an integer variable i with a value of 5.
        long i = 5;
//                Create a while loop that runs so long as i is less than or equal to 15
//                Each loop iteration, output the current value of i, then increment i by one.
                while (i <= 15) {
            System.out.println(i++);
        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        long i = 2;
        do {
            System.out.println(i);
            i*=i;

        } while (i < 1000000);
//                Alter your loop to count backwards by 5's from 100 to -10.
        for (int x =100; x >= -10; x--) {
            System.out.println(x);
            x-=5;
        }
//                Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        for (long i =2; i < 1000000; i++) {
            System.out.println(i);
            i*=i;
        }

//                Fizzbuzz
//
//                One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                        Write a program that prints the numbers from 1 to 100.
//                For multiples of three: print “Fizz” instead of the number.
//                For the multiples of five: print “Buzz”.
//                For numbers which are multiples of both three and five: print “FizzBuzz”.
//                Display a table of powers.
//
//                        Prompt the user to enter an integer.
//                Display a table of squares and cubes from 1 to the value entered.
//                Ask if the user wants to continue.
//                Assume that the user will enter valid data.
//                Only continue if the user agrees to.
//                Example Output




        }
}
