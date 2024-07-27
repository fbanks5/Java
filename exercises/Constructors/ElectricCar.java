package exercises.Constructors;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String brand, int batteryCapacity) {
        super(model, brand);
        this.batteryCapacity = batteryCapacity;
    }
}
