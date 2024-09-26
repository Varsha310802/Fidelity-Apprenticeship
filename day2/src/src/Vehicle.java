public class Vehicle {
    String registrationNumber ;
    String brand;
    Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public double CalculateParkingFee(){
        return 0;
    }
    void Display(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
    int noOfDoors;
    Car(String registrationNumber, String brand, int noOfDoors) {
        super(registrationNumber, brand);
        this.noOfDoors = noOfDoors;
    }
     @Override
    public double CalculateParkingFee(){
        if(noOfDoors ==2){
            return 50;
        }
        else if(noOfDoors ==4){
            return 70;
        }
        return 100;
     }
     @Override
    public void Display(){
        super.Display();
        System.out.println("No of Doors.: " + noOfDoors);
         System.out.println("The parking fees is :"+CalculateParkingFee());
     }
}
class Motorcycle extends Vehicle {
    String engineType;
    Motorcycle(String registrationNumber, String brand,String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double CalculateParkingFee(){

        return 50;
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Motorcycle Engine Type: " + engineType);
        System.out.println("The parking fees is :"+CalculateParkingFee());
    }
}