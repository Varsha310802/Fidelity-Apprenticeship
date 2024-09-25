import java.util.Scanner;
public class EmployeePayrollManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter details for permanent Employee :");
        System.out.println("Employee ID: ");
        int empID=sc.nextInt();
        System.out.println("Employee name :");
        String empname=sc.next();
        System.out.println("Basic Salary :");
        float basicSalary=sc.nextFloat();
        System.out.println("Provident Fund :");
        int pf=sc.nextInt();

        PermanentEmployee emp1=new PermanentEmployee(empID,empname,basicSalary,pf);
        System.out.println(" ");
        System.out.println("Permanent Employee Details:");
        emp1.Display();

        System.out.println();
        System.out.println("enter details for temporary Employee :");
        System.out.println("Employee ID: ");
        empID=sc.nextInt();
        System.out.println("Employee name :");
        empname=sc.next();
        System.out.println("Daily Wages :");
        int dailyWages=sc.nextInt();
        System.out.println("Number Of Days Worked:");
        int noOfDays=sc.nextInt();

        TemporaryEmployee emp2=new TemporaryEmployee(empID,empname,dailyWages,noOfDays);
        System.out.println("Temporary Employee Details:");
        emp2.Display();
    }
}
