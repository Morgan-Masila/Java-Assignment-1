class SportsCar extends Vehicle implements Automobile {

    SportsCar(String brand, int year, int speed) {
        super(brand, year, speed);
    }

    // Interface methods
    @Override
    public void startEngine() {
        System.out.println("SportsCar engine roaring!");
    }

    @Override
    public void honk() {
        System.out.println("SportsCar honking loudly!");
    }

    @Override
    public void turnOnAc() {
        System.out.println("SportsCar AC turned on.");
    }

    @Override
    public void playMusic() {
        System.out.println("SportsCar playing music.");
    }

    // Abstract class methods
    @Override
    public void accelerate() {
        System.out.println("SportsCar accelerating very fast!");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar stopping quickly.");
    }

    @Override
    public void gas() {
        System.out.println("SportsCar using premium fuel.");
    }
}