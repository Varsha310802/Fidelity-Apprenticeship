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

        PermanentEmployee emp1=new PermanentEmployee();
        emp1.initialize(empID,empname,basicSalary,pf);
        System.out.println("Permanent Emplyee Details:");
        emp1.Display();

        System.out.println();
        System.out.println("enter details for temporary Employee :");
        System.out.println("Employee ID: ");
        empID=sc.nextInt();
        System.out.println("Emplyee name :");
        empname=sc.next();
        System.out.println("Daily Wages :");
        int dailyWages=sc.nextInt();
        System.out.println("Number Of Days:");
        int noOfDays=sc.nextInt();

        TemporaryEmployee    emp2=new TemporaryEmployee();
        emp2.initialize(empID,empname,dailyWages,noOfDays);
        emp2.Display();
    }
}
