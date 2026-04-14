class Bus extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Bus: Gradually increasing speed while carrying many passengers.");
    }

    @Override
    void stop() {
        System.out.println("Bus: Applying heavy-duty air brakes to slow down the vehicle.");
    }

    @Override
    void gas() {
        System.out.println("Bus: Refueling with high-capacity diesel fuel.");
    }
}
