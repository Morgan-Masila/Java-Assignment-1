public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating fast!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping.");
    }

    @Override
    public void gas() {
        System.out.println("Motorcycle using petrol.");
    }
}
