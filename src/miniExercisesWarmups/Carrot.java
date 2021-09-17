package miniExercisesWarmups;
//For the above classes, create an interface that will separate out shared functionality between these two classes dealing with consuming them. After you are finished with this exercise, please move directly into the curriculum exercise for Abstract Classes and Interfaces.
public class Carrot {

    private boolean isPeeled;

    // getters setters constructors...

    public void consume() {
        System.out.println("Eat, bite by bite");
    }

    public void checkIfExpired() {
        System.out.println("Observe color and smell");
    }

    public void throwAway() {
        System.out.println("Throw into compost pile");
    }

}