package miniExercisesWarmups;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Investigate the substring method for String objects in the Java API. Find out what kind of exception it throws. Create a test class with a main method. Set up a try-catch block that defines a string and finds its length. Once you have the length of your string, modify your program so it creates a substring from your original string, but give it an index that doesn't exist so you get the error message.
//Optional: play with the .getMessage and .printStackTrace methods.
//
//        Optional: what are some other ways you can get the same exception? Try to set up your program so as to produce and catch these exceptions.
public class ExceptionalWarmup {

    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            //userInput = null;
            int userInputAsInteger = Integer.parseInt(userInput, 10, 15, 10);
        } catch (NullPointerException npx){
            System.out.println("Oops you didn't enter anything");
            npx.printStackTrace();
        } catch (IndexOutOfBoundsException iobx) {
            System.out.println("Oops your string wasn't long enough");
            iobx.printStackTrace();
        } catch (NumberFormatException nfx){
            System.out.println("No integer between chars 10 and 15");
            nfx.printStackTrace();
        } finally {
            System.out.println("That was useful wasn't it?");
        }
    }

    public void subListMaker(String sentence) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray) {
            wordArrayList.add(word);
        }
        List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
        String newSentence = String.join(" ", shorterList);
        System.out.println(newSentence);
    }

//    Given the following code, investigate the kinds of exceptions it could throw and write a try-catch structure catching these exceptions and providing the appropriate output messages. Be careful of where exactly you begin your try-catch structure. Optionally, add a finally clause.
//
//    Test your code to make sure that the exceptions are indeed caught. Test the code by entering a null value as the method's String parameter (subListMaker(null) or String sentence = null; subListMaker(sentence)), and by entering negative integers and integers larger than the number of words in the sentence as the user inputs. Try to modify the warning for an improper integer to suggest to the user what range of integers is acceptable.
//
//    To search for what exceptions a method throws, use the following search string: Java + number of your Java JDK + API + name of method. For example, Java 16 API substring.





//    Write a class called Lizard with one instance variable, String name, and a constructor that takes one argument, a String name. The constructor should throw an illegal argument exception if the a null value is passed into the name parameter. Optional: find out how to check if a string is empty or blank, and throw an illegal argument exception in that case, too.
}