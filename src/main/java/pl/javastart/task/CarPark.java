package pl.javastart.task;

import java.util.Arrays;

public class CarPark {

    private Vehicle[] vehicles = new Vehicle[10];
    private int vehiclesCounter = 0;

    public void addVehicle(Vehicle vehicle) {
        ensureCapacity();
        vehicles[vehiclesCounter] = vehicle;
        vehiclesCounter++;
    }

    private void ensureCapacity() {
        if (vehiclesCounter >= vehicles.length) {
            return;
        }
        vehicles = Arrays.copyOf(vehicles, vehicles.length * 2);
    }

    public void printAllCars() {
        for (int i = 0; i < vehiclesCounter; i++) {
            vehicles[i].printInfo();
            vehicles[i].printRange();
        }
    }
}
