import java.util.Scanner;
//imports scanner class from Java API

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        String myCohort = "Draco";
//        String timeOfDay = "morning";
//        System.out.printf("Good %s, %s!%n",timeOfDay, myCohort);
////        System.out.println(myCohort);
////        System.out.printf("Hellloooooo, %s", myCohort);
//        // not in a separate line so we gotta fix it with a %n symbol
//        System.out.printf("Hellloooooo, %s!%n", myCohort);
//        // printf is in a lot of diff languages
//        //formats the following var as a string
//        // %s means string format
//        System.out.println("Will this be a separate line?");
        Scanner scanner = new Scanner(System.in);
//        // notice you ALWAYS have to declare a variable type
//        System.out.println("Enter a string: ");
//        String userInput = scanner.nextLine();
////        System.out.println("Your word was " + userInput);
//        System.out.printf("Your string was %s", userInput);

        //===== mini exercise ======
//        Write a Java program that asks the user for their name, then outputs “Hello, name”
//        Use printLine() first, then reformat to use printf
        // i need to do this laters


        System.out.println("Enter an integer: ");
        int userInput = scanner.nextInt();


//        System.out.println("You entered %d%n", userInput);
        // we can't use this because we get a format exception

//        Option 1: an extra nextLine()
//        String ghostString = scanner.nextLine();

//        Option 2: Integer.parseint(next());
//        int userInputInt = Integer.parseInt(scanner.next());
        // nevermind this don't work

//        Option 3 concatenate a .next() and a .nextLine()

        System.out.println("Enter a string: ");
        String firstString = scanner.next() + scanner.nextLine();
        System.out.println("Enter a another string: ");
        String secondString = scanner.nextLine();

        System.out.println("First sentence: " +  firstString + "\n Second string: " + secondString);

    }
}
