import java.util.Scanner;

public class SquareandCubeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = sc.nextDouble();
        SquareandCube sac=new SquareandCube();
        System.out.println("The square of "+a+" is : "+sac.FindSquare(a));
        System.out.println("The cube of "+a+" is : "+sac.FindCube(a));
    }
}
