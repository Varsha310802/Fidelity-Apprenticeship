public class Calculator {
    public int Addition(int a, int b) {
        return a + b;
    }
    public int Subtraction(int a, int b) {
        return a - b;

    }
    public int Multiplication(int a, int b) {
        return a * b;
    }
    public double Division(int a, int b ,double[] remainder) {
        if(b==0){
            System.out.println("Division by zero is not possible");
        }
        remainder[0]=a%b;
        return (double) a/b;
    }
}
