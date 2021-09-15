package vehicles;

public class Tractor extends Vehicle {
    public void makeNoise(){
        System.out.println(this.getName() + " goes putt putt");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("putt putt");
        System.out.println(" ... clunk boom crack");
    }

    public Tractor() {
        super("Just a tractor");
    }
    public Tractor(String name){
        super(name);
    }
}
