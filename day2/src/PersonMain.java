import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("enter your gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        Person per=new Person(name,gender,age);
        per.Display();
    }
}
