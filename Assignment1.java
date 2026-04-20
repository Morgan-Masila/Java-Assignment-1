public public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected double speed;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0.0;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();

    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Year: " + year + " | Speed: " + speed + " km/h");
    }
}
 
