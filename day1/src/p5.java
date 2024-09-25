import java.util.Scanner;

public class p5 {
    public static void Vote(int age){
        if(age>=18){
            System.out.println("You are older than 18,hence eligible to vote");
        }
        else{
            System.out.println("You are not older than 18,hence not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        Vote(age);
    }
}
