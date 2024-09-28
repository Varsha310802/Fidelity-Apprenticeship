import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator : ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        Calculator calc = new Calculator();
        double[] remainder=new double[1];
        switch(operator) {
            case '+' :
            System.out.println("Result of " + a + operator + b + " is " + calc.Addition(a, b));
            break;
            case '-' :
             System.out.println("Result of " + a + operator + b + " is " + calc.Subtraction(a, b));
             break;
             case '*' :
                 System.out.println("Result of " + a + operator + b + " is " + calc.Multiplication(a, b));
                 break;
                 case '/' :
                     double quotient=calc.Division(a,b,remainder);
                     System.out.println("Result of " + a + operator + b + " is "+ quotient );
                     System.out.println("Remainder = " + remainder[0] );
                     break;
                     default :
                         System.out.println("Invalid operator");
                         break;


        }
    }
}
