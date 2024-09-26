public class CalculateAreaMain {
    public static void main(String[] args) {
        CalculateArea calc = new CalculateArea();
        double squareArea=calc.calculate(5.0);
        System.out.println("The Area of square is : " +squareArea);

        double rectArea=calc.calculate(4.0,6.0);
        System.out.println("The Area of rectangle is : " +rectArea);

        double circleArea=calc.calculate(3.0,Boolean.TRUE);
        System.out.println("The Area of circle is : " +circleArea);

    }
}
