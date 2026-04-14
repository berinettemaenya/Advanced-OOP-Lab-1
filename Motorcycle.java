class Motorcycle extends Vehicle {
    
    @Override
    void accelerate() {
        System.out.println("Motorcycle: Increasing speed by twisting the hand throttle.");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle: Squeezing the hand brake and pressing the foot brake.");
    }

    @Override
    void gas() {
        System.out.println("Motorcycle: Adding premium gasoline to the tank.");
    }
}
