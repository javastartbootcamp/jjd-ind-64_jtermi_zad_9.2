package pl.javastart.task;

public class Truck extends Car {

    double loadWeight;

    public Truck(String name, double tankVolume, double averageConsumption, boolean airConditionOn, double loadWeight) {
        super(name, tankVolume, averageConsumption, airConditionOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public void setAironditionOn() {
        this.airConditionOn = true;
    }

    @Override
    public double calculateRange() {
        double airConditionConsumption = 0;
        double consumptionOnLoad = loadWeight / 100 * 0.5;
        if (airConditionOn) {
            airConditionConsumption = 1.6;
        }

        return tankVolume /
                (averageConsumption + airConditionConsumption + consumptionOnLoad)
                * 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Waga ładunku: %s\n", loadWeight);
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}
