public class MiniVehicleWarmup {

//    Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.
//Create a method in the subclass of the Vehicle class that overrides the superclass makeNoise method.
    //Create a breakingDownNoise() method in the subclass. It should call super.makeNoise() and then add a second sout that adds a second noise after the first one.

//    Create a Car class if you have not already done so. It should be a subclass of Vehicle. Create a Garage class with two properties. It should have a Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.
//    Bonus:
//    Create a findVehicle method
//    The findVehicle method should be part of the Garage class
//    It takes a string and an array of Vehicles

//    It returns the vehicle that the customer is looking for (the vehicle the name of which matches the string)
//    If the vehicle is not in the garage, it returns a Vehicle with a null name


}
