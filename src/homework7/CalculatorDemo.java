package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculyator = new Calculator(4,2);
        double c;

        c = myCalculyator.plus();
        System.out.println(c);

        c = myCalculyator.minus();
        System.out.println(c);

        c= myCalculyator.divide();
        System.out.println(c);

        c= myCalculyator.multiply();
        System.out.println(c);
    }
}
