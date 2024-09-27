import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        String fullName= firstName + " " + lastName;
        System.out.println("Full name: "+fullName);

    }
}
