import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
        // %-10 might come in handy in future exercises
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n Please insert an integer ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("The number you entered is " +  userInput);
//        // if you input something that's not an integer you get an InputMismatchException error
//        System.out.println("\n please enter three words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.println("you said the following three words... \n first: " + firstWord + "\n second: " + secondWord + "\n third: " + thirdWord );
//        System.out.printf("\"%s\"%n\"%s\"%n\"%s\"%n", firstWord, secondWord, thirdWord);
//        What happens if you enter less than 3 words?
//        won't run until you type in the 3rd word
//        What happens if you enter more than 3 words?
//        it won't let you, it runs before u can try
//        System.out.println("Please write a sentence");
//        String sentence  = scanner.nextLine();
//        sentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %s\n", sentence);

//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//
//        do you capture all the words?
//                Rewrite the above example using the nextLine method.
        System.out.print("Enter the length: ");
        int lengthInput = scanner.nextInt();
        System.out.print("Enter the width: ");
        int widthInput = scanner.nextInt();
        int userInput = 2 * (lengthInput + widthInput);
        System.out.println("Perimeter of Rectangle: " + userInput);
        int area = lengthInput * widthInput;
        System.out.println("Area of rectangle is: " + area );



//        # Console IO Bonus Exercises
//
//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
//
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()
    }
}
