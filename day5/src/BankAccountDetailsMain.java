import java.util.Scanner;
public class BankAccountDetailsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id: ");
        int id = sc.nextInt();
        System.out.println("Enter account type: ");
        String type = sc.next();
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        BankAccountDetails account= new BankAccountDetails(id, type, balance);
        System.out.println("Enter amount to withdraw: ");
        double withdrawamount = sc.nextDouble();
        System.out.println(account.getdetails());
        if(account.Withdraw(withdrawamount)) {
            System.out.println("New Balance: "+account.getBalance());
        }
else{
    System.out.println("Insufficient Balance");

        }
    }
}
