import java.util.Scanner;

public class UserDefinedExceptionMain {
    public static Employee findEmployeeById(Employee[] employees,int id) throws  UserDefinedException {
        for (Employee emp:employees){
            if (emp.getId() == id){
                return emp;
            }
        }
        throw new UserDefinedException("Employee with Id "+id +" not found");
    }

    public static void main(String[] args) throws UserDefinedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee id for Employee "+(i+1)+": ");
            int id = sc.nextInt();
            System.out.print("Enter employee name: ");
            String name = sc.next();
            employees[i] = new Employee(id,name);
        }
        System.out.print("Enter the employee id to be found: ");
        int id = sc.nextInt();
        try{
            Employee emp=findEmployeeById(employees,id);
            System.out.println("Employee found : " + emp.getName());

        }
        catch (UserDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}
