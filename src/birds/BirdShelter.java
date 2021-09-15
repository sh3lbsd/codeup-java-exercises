package birds;

public class BirdShelter {
    public void visitShelterAndHearThePrettyBirdies(Bird[] allTheBirdsInTheShelter){
        for (Bird bird : allTheBirdsInTheShelter) {
                    System.out.print(bird.getName() + " goes ");
                    bird.makeNoise();
                }
    }

    public void takeCareOfTheBirdie(Bird birdPatient){
        birdPatient.makeNoise();
    }
}
