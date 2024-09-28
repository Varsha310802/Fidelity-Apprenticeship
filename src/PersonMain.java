import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter first name: ");
        person.setFirstName(sc.next());
        System.out.println("Enter last name: ");
        person.setLastName(sc.next());
        System.out.println("Enter date of birth in yyyy/MM//dd format: ");
        String dobInput = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dob = LocalDate.parse(dobInput,formatter);
        person.setDob(dob);
        person.DisplayDetails();
    }
}
