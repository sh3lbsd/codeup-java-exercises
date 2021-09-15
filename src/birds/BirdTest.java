package birds;

public class BirdTest {
    public static void main(String[] args) {
//        birds.Bird cardinal = new birds.Bird();
//        cardinal.setName("cardinal");
        Bird cardinal = new Bird("Cardinal");
        System.out.println(cardinal);
        System.out.println(cardinal.getName() + " says:");
        cardinal.makeNoise();
        cardinal.move();

//        birds.Duck mallard = new birds.Duck();
//        mallard.setName("Mallard");
        birds.Duck mallard = new birds.Duck("Mallard");
        System.out.println(mallard);
        System.out.println(mallard.getName() + " says:");
        mallard.makeNoise();
        mallard.move();

        Finch goldfinch = new Finch();
        goldfinch.setName("goldfinch");
        System.out.println(goldfinch.getName() + " says:");
        goldfinch.makeNoise();

        Bird myBird = new birds.Duck();
        myBird.move();
        myBird.makeNoise();
    }
}
