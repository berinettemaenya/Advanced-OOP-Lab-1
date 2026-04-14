public class Sedan extends Vehicle implements Automobile {
    // Implementing Abstract Methods from Vehicle
    @Override
    public void accelerate() {
        System.out.println("Sedan: Accelerating smoothly.");
    }

    // OVERLOADING: Adding a second version of accelerate with a parameter 
    public void accelerate(int increment) {
        this.speed += increment;
        System.out.println("Sedan: Speed increased by " + increment + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan: Stopping safely.");
    }

    @Override
    public void gas() {
        System.out.println("Sedan: Filling with gasoline.");
    }

    // Implementing Interface Methods (MUST be public)
    @Override
    public void openTrunk() {
        System.out.println("Sedan: Trunk opened.");
    }

    @Override
    public void setFuelType(String fuel) {
        System.out.println("Sedan: Fuel set to " + fuel);
    }
}
