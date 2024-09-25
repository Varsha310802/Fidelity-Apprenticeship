import java.util.*;
public class Employee {
    int id;
    String name;
    float BasicSalary;
    float Bonus;
    float NetSalary;
//    Employee(int id,String name,float BasicSalary,float Bonus,Float NetSalary){
//        this.id=id;
//        this.name=name;
//        this.BasicSalary=BasicSalary;
//        this.Bonus=Bonus;
//        this.NetSalary=NetSalary;
//    }
    void Display(){
        System.out.println(id+name+BasicSalary+Bonus+NetSalary);
    }
}
class PermanentEmployee extends Employee{
    int Pf;
    void initialize(int id,String name,float BasicSalary,int Pf){
        this.id=id;
        this.name=name;
        this.BasicSalary=BasicSalary;
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
    public void calculateNetSalary(){
            NetSalary=BasicSalary-Pf;
    }

}
class TemporaryEmployee extends Employee {
    int DailyWages;
    int NoOfDays;

    void initialize(int id, String name,int DailyWages, int NoOfDays) {
        this.id=id;
        this.name=name;
        this.DailyWages = DailyWages;
        this.NoOfDays = NoOfDays;
        CalculateBonus();
        CalculateNetSalary();
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
            Bonus=0.8f*NetSalary;
        }
    }
    public void CalculateNetSalary(){
        NetSalary = DailyWages * NoOfDays;
    }
}
