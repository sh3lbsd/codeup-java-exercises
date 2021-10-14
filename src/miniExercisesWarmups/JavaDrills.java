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

    public static void main(String[] args) {
        System.out.println(flipOuterCase("cat")); // CaT
        System.out.println(flipOuterCase("CaT")); // cat
        System.out.println(flipOuterCase("caT")); // Cat
        System.out.println(flipOuterCase("cAt")); // CAT
    }

}
