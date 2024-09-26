public class VehicleHierarchial {
    public void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car1 extends VehicleHierarchial{
    public void drive(){
        System.out.println("Car is being drived");
    }
}
class Bike1 extends VehicleHierarchial{
    public void ride(){
        System.out.println("Bike is being rided");
    }
}


