//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Mobile p1=new Mobile();
    System.out.println("enter product ud");
    int pid=sc.nextInt();
    System.out.println("enter product name");
    String pname=sc.next();
    System.out.println("enter product price");
    int pprice=sc.nextInt();
    System.out.println("Enter warranty");
    int warranty=sc.nextInt();
    System.out.println("enter network type");
    String network=sc.next();
        p1.Initialize(pid,pname,pprice,warranty,network);
    p1.Display();

    }
}