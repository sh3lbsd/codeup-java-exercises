package birds;

public class BirdShelterTest {
    public static void main(String[] args) {
        // Polymorphic array:
        // Poly = many ; morphic = shape/form
        birds.Bird[] birds = new birds.Bird[3];
//        birds.Bird goldfinch = new birds.Finch();
//        goldfinch.setName("Lesser Goldfinch");
        birds[0] = new birds.Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new birds.Duck();
        birds[1].setName("Mallard");
        birds[2] = new birds.Penguin();
        birds[2].setName("Emperor birds.Penguin");

        birds.BirdShelter healingWings = new birds.BirdShelter();
//        healingWings.visitShelterAndHearThePrettyBirdies(birds);
        healingWings.takeCareOfTheBirdie(birds[2]);
    }
}
