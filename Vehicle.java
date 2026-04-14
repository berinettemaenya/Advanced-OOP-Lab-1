public abstract class Vehicle {
    String brand;
    int speed;
    String color; // This was causing the warning

    abstract void accelerate();
    abstract void stop();
    abstract void gas();

    void displayInfo() {
        // By adding 'color' here, the warning will disappear
        System.out.println("Brand: " + brand + " | Speed: " + speed + " | Color: " + color);
    }
}
    
