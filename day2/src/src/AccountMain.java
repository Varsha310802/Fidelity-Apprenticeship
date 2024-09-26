import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the account number :");
        int ano = sc.nextInt();
        System.out.println("enter the account name :");
        String name = sc.next();
        System.out.println("enter the account balance :");
        float balance = sc.nextFloat();
        System.out.println("enter the action to be performed :1)Deposit 2)Withdraw 3)Check Balance :");
        int option=sc.nextInt();
        Account acc=new Account(ano,name,balance);
        switch (option) {
            case 1:System.out.println("enter the amount to deposit :");
            float damount=sc.nextFloat();
                acc.Deposit(damount);
            break;
            case 2:System.out.println("enter the amount to withdraw :");
                float wamount=sc.nextFloat();
                acc.Withdraw(wamount);
            break;
            case 3:acc.Check_Balance();
            break;

        }
    }
}
