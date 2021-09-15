package birds;

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
