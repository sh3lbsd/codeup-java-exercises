import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        rndomNum();
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.
    }
    public static void rndomNum () {
        boolean keepGoing = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int result = (int) Math.floor(Math.random() * 100 + 1);
//        System.out.println(result);
        while (keepGoing) {
            int userGuess = sc.nextInt();
            if (userGuess == result) {
                System.out.println("GOOD GUESS!");
                keepGoing = false;
            } else if (userGuess < result) {
                System.out.println("HIGHER");
            } else if (userGuess > result) {
                System.out.println("LOWER");
            }
        }
    }
}
