package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Vehicle auto1 = new Truck("MAN", 350, 25, false, 1340);
        Vehicle auto2 = new Car("Audi", 350, 25, false);
        Vehicle auto3 = new Truck("VOLVO", 600, 25, false, 19000);
        Vehicle auto4 = new Car("Audi", 350, 25, false);

        CarPark carpark = new CarPark();
        carpark.addVehicle(auto1);
        carpark.addVehicle(auto2);
        carpark.addVehicle(auto3);
        carpark.addVehicle(auto4);

        carpark.printAllCars();

        auto1.setAironditionOn();
        auto2.setAironditionOn();
        auto3.setAironditionOn();
        auto4.setAironditionOn();

        carpark.printAllCars();

    }
}
