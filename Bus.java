public class Bus extends Vehicle {

    public Bus(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void accelerate() {
        System.out.println("Bus accelerating slowly.");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopping.");
    }

    @Override
    public void gas() {
        System.out.println("Bus using diesel.");
    }
}
