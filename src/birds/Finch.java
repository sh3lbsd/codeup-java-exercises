package birds;

import birds.Bird;

public class Finch extends Bird {
    public void makeNoise(){
        // call the superclass makeNoise method
        super.makeNoise();
        // then add extra custom code after running the superclass code
        System.out.println("Chirp chirp");
    }

    public Finch(){
        System.out.println("A new finch has been created.");
    }
}
