public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected double speed;

    // Constructor
    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    // Abstract methods
    public abstract void accelerate();

    public abstract void stop();

    public abstract void gas();

}
