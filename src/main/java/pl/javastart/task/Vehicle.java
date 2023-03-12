package pl.javastart.task;

public class Vehicle {

    String name;
    double tankVolume;
    double averageConsumption;

    public Vehicle(String name, double tankVolume, double averageConsumption) {
        this.name = name;
        this.tankVolume = tankVolume;
        this.averageConsumption = averageConsumption;
    }

    public double calculateRange() {
        return -1;
    }

    public void setAironditionOn() {
        System.out.println("Metoda nie została nadpisana");
    }

    public void printInfo() {
        System.out.println("\n---------------------------------------------");
        System.out.printf("Nazwa pojazdu: %s\n", name);
        System.out.printf("Pojemność zbiornika paliwa: %s\n", tankVolume);
        System.out.printf("Średnie spalanie: %s\n", averageConsumption);
    }

    public void printRange() {
        System.out.printf("Zasięg samochodu wynosi: %.0f km\n", this.calculateRange());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getAverageConsumption() {
        return averageConsumption;
    }

    public void setAverageConsumption(double averageConsumption) {
        this.averageConsumption = averageConsumption;
    }
}