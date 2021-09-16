package birds;
//Challenge.
//        In the birds package, create an Ornithologist class. The ornithologist should have a changeBirdName method that takes a String newBirdName and a Bird birdToRename as its parameters. It should allow the ornithologist to change the bird's name and announce that it has changed the name from the old name to the new name. Create an OrnithologyConference class. Instantiate an ornithologist and a new bird and have the ornithologist announce the name change on the new bird.

//Challenge.
//        Modify the Birds class so as to keep count of how many birds are created and output the bird count every time a new bird is created. DRY out the code.
public class Bird {
    // what kind of bird is it?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

//    public birds.Bird(String name){
//        this.name = name;
//    }

    public Bird(){

    }

    public Bird(String name){
        this.name = name;
        System.out.println("A new bird has been created.");
    }
}
