public class Main {
    public static void main(String[] args) {

        // Creating an object of Sedan
        Sedan sedan = new Sedan("Toyota", 120, 0);

        // Method Overriding
        // Calls the overridden method in Sedan
        sedan.accelerate();

        // Method Overloading
        // Same method name, different parameter
        sedan.accelerate(40);

        // Extra (optional but good for demonstration)
        sedan.startEngine();
        sedan.honk();
        sedan.turnOnAc();
        sedan.playMusic();
        sedan.stop();
    }
}