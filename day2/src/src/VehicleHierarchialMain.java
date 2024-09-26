public class VehicleHierarchialMain {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Bike1 bike1 = new Bike1();

        car1.start();
        car1.drive();

        bike1.start();
        bike1.ride();
    }
}
