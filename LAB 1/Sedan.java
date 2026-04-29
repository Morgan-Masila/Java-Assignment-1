class Sedan extends Vehicle implements Automobile {

    Sedan(String brand, int year, int speed) {
        super(brand, year, speed);
    }

    // Interface methods
    @Override
    public void startEngine() {
        System.out.println("Sedan engine started.");
    }

    @Override
    public void honk() {
        System.out.println("Sedan honking.");
    }

    @Override
    public void turnOnAc() {
        System.out.println("Sedan AC turned on.");
    }

    @Override
    public void playMusic() {
        System.out.println("Sedan playing music.");
    }

    // Abstract class methods
    @Override
    public void accelerate() {
        System.out.println("Sedan accelerating normally.");
    }

    // Method Overloading
    public void accelerate(int increase) {
        System.out.println("Sedan accelerating by " + increase + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping.");
    }

    @Override
    public void gas() {
        System.out.println("Sedan using petrol.");
    }
}