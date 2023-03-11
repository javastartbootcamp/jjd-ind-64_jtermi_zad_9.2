package pl.javastart.task;

public class Car extends Vehicle {

    boolean airConditionOn;

    public Car() {
    }

    public Car(String name, double tankVolume, double averageConsumption, boolean airConditionOn) {
        super(name, tankVolume, averageConsumption);
        this.airConditionOn = airConditionOn;
    }

    public boolean isAirConditionOn() {
        return airConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        this.airConditionOn = airConditionOn;
    }

    @Override
    public void setAironditionOn() {
        this.airConditionOn = true;
    }

    @Override
    public double calculateRange() {
        double airConditionConsumption = 0;

        if (airConditionOn) {
            airConditionConsumption = 0.8;
        }

        return  tankVolume /
               (averageConsumption + airConditionConsumption)
               * 100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Klimatyzacja włączona: %s\n", airConditionOn);
    }
}
