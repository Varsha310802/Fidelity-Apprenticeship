class Animal {
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Mammal walks");

    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Dog barks");
    }
}


