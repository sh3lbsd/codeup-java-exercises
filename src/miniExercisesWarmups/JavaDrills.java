package miniExercisesWarmups;
//NOT FINISHED
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//        ================================= WARM UP
//        In `codeup-java-exercises`, create a class `JavaDrills`, with the following:

public class JavaDrills {
    //        Create a public static method, `flipOuterCase`, that takes in a string and returns the string
    public static void flipOuterCase(String str) {
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
        char[] chars = str.toCharArray();

        for (int = 0; i <chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static returnTotalDifference()

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("caT")); // Cat
        System.out.println(flipOuterCase("cAt")); // CAT
    }

}
//================================= WARM UP
//        In `codeup-java-exercises`, in `JavaDrills`:
//        Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//        returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//        returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3

    public static int returnTotalDifference(List<Integer> integerListOne, List<Integer> integerListTwo){
    int sumOfOne = 0;
    int sumOfTwo = 0;

    for (int integer : integerListOne){
      sumOfOne += integer;
    }
    for (int integer: integerListTwo){
        sumOfTwo += integer;
    }
    return sumOfOne - sumOfTwo;
}


    public static void main(String[] args) {
        System.out.println(returnTotalDifference(Arrays.asList(10,2,3),Arrays.asList(1,2,3)));
}
}    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2



//        ================================= WARM UP
//        In `codeup-java-exercises`, in`JavaDrills`, add the following:
//        Create a public static method, `flipInnerCase`, that takes in a string and returns the string
//        with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipInnerCase(“cat”)); // cAt
//        System.out.println(flipInnerCase(“CaT”)); // CAT
//        System.out.println(flipInnerCase(“caT”)); // cAT
//        System.out.println(flipInnerCase(“codeup”)); // cODEUp
//        System.out.println(flipInnerCase(“CoDeup”)); // COdEUp