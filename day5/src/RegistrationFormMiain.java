import java.util.Scanner;

public class RegistrationFormMiain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Country: ");
        String country = sc.next();
        RegistrationForm rf = new RegistrationForm(name, age, country);
        rf.display();
    }
}
