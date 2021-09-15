package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.setName("Lexus");
        Car lambo = new Car();
        lambo.setName("Lambo");
        Car ferrari = new Car();
        ferrari.setName("Ferrari");

        Vehicle[] carsInTheGarage = new Vehicle[3];
        carsInTheGarage[0] = lexus;
        carsInTheGarage[1] = lambo;
        carsInTheGarage[2] = ferrari;

        Tractor yellowTractor = new Tractor();
        yellowTractor.setName("Yellow tractor");
        carsInTheGarage[2] = yellowTractor;

        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
//        garage.alarmCascade();

        Vehicle customersVehicle = garage.findVehicle("lambo", carsInTheGarage);
        System.out.println(customersVehicle.getName());
        Vehicle customersVehicle2 = garage.findVehicle("Yellow tractor", carsInTheGarage);
        System.out.println(customersVehicle2.getName());
        Vehicle customersVehicle3 = garage.findVehicle("Mustang", carsInTheGarage);
        System.out.println(customersVehicle3.getName());
    }
}
