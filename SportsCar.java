public class SportsCar extends Vehicle implements Automobile {
    @Override
    public void accelerate() {
        System.out.println("SportsCar: Rapid acceleration!");
    }

    @Override
    public void stop() {
        System.out.println("SportsCar: Instant braking.");
    }

    @Override
    public void gas() {
        System.out.println("SportsCar: Filling with racing fuel.");
    }

    @Override
    public void openTrunk() {
        System.out.println("SportsCar: Small trunk opened.");
    }

    @Override
    public void setFuelType(String fuel) {
        System.out.println("SportsCar: High-octane fuel set to " + fuel);
    }
}
