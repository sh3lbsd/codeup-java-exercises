package miniExercisesWarmups;
//For the above classes, create an interface that will separate out shared functionality between these two classes dealing with consuming them. After you are finished with this exercise, please move directly into the curriculum exercise for Abstract Classes and Interfaces.
public class Pill {

    private String medicationName;
    private String pharmacistInstructions;

    // getters setters constructors...

    public void consume() {
        System.out.println("Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println("Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println("Wash down sink...");
    }

}