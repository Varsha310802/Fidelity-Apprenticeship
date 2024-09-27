import java.util.Scanner;

public class BooleanResultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x = sc.nextInt();
        System.out.println("Enter the value for y:");
        int y = sc.nextInt();

        BooleanResult res=new BooleanResult();
        System.out.println("The result of whether x is less than y is "+
                res.checkLesser(x,y));
    }
}
