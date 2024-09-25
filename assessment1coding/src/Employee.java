import java.util.*;
public class Employee {
    int id;
    String name;
    float BasicSalary;
    float Bonus;
    float NetSalary;
    Employee(int id,String name,float BasicSalary){
        this.id=id;
       this.name=name;
        this.BasicSalary=BasicSalary;
    }
    void Display(){
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Basic Salary : "+BasicSalary);
        System.out.println("Employee Bonus : "+Bonus);
        System.out.println("Employee NetSalary : "+NetSalary);
    }
}
class PermanentEmployee extends Employee{
    int Pf;
    PermanentEmployee(int id,String name,float BasicSalary,int Pf){
        super(id,name,BasicSalary);
        this.Pf=Pf;
        CalculateBonus();
        calculateNetSalary();
    }
    public void CalculateBonus() {
        if (Pf < 1000) {
            Bonus = 0.10f * BasicSalary;
        } else if (Pf >= 1000 && Pf < 1500) {
            Bonus = 0.115f * BasicSalary;
        } else if (Pf >= 1500 && Pf < 1800) {
            Bonus = 0.12f * BasicSalary;
        } else {
            Bonus = 0.15f * BasicSalary;
        }
    }
    void calculateNetSalary(){

        NetSalary=BasicSalary-Pf;
    }

}
class TemporaryEmployee extends Employee {
    int DailyWages;
    int NoOfDays;

    TemporaryEmployee(int id, String name,int DailyWages, int NoOfDays) {
       super(id,name,DailyWages*NoOfDays);
        this.DailyWages = DailyWages;
        this.NoOfDays = NoOfDays;
        CalculateNetSalary();
        CalculateBonus();

    }
    public void CalculateNetSalary(){
        NetSalary = DailyWages * NoOfDays;
    }

    public void CalculateBonus(){
        NetSalary = DailyWages * NoOfDays;
        if (DailyWages < 1000){
            Bonus=0.15f*NetSalary;
        }
        else if(DailyWages >= 1000 && DailyWages < 1500){
            Bonus=0.12f*NetSalary;
        }
        else if(DailyWages >= 1500 && DailyWages < 1750){
            Bonus=0.11f*NetSalary;
        }
        else{
            Bonus=0.08f*NetSalary;
        }
    }
    @Override
    void Display() {
        System.out.println("Employee ID : "+id);
        System.out.println("Employee Name : "+name);
        System.out.println("Daily Wages : "+DailyWages);
        System.out.println("No of Days Worked : "+NoOfDays);
        System.out.println("Employee Bonus : "+Bonus);
        System.out.println("Employee NetSalary : "+NetSalary);
    }

}
