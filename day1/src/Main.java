import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    float marks=sc.nextFloat();
    String grade;
    if(marks>=90){
        System.out.println("A Grade");
        grade="A";
    }
    else if(marks<90 && marks>=80){
        System.out.println("B Grade");
        grade="B";
    }
    else if(marks<80 && marks>=70){
        System.out.println("C Grade");
        grade="C";
    }
    else if(marks<70 && marks>=60){
        System.out.println("D Grade");
        grade="D";
    }
    else {
        System.out.println("F Grade");
        grade="F";
    }
    switch (grade) {
        case "A":
            System.out.println("Excellent");
            break;
        case "B":
            System.out.println("Great");
            break;
        case "C":
            System.out.println("Good");
            break;
        case "D":
            System.out.println("Not Bad");
            break;
        case "F":
            System.out.println("Poor");
            break;
    }
}
}