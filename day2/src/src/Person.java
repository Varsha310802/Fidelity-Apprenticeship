public class Person {
    private String name;
    String gender;
    int age;

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

     public String getName() {
        return name;
    }
    public void Display(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
    }
}