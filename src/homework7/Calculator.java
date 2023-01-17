package homework7;

public class Calculator {
    double number1;
    double number2;

    Calculator(double a, double b) {
        number1 = a;
        number2 = b;
    }

    double plus() {
        return number1 + number2;
    }

    double minus() {
        return number1 - number2;
    }

    double divide() {
        if (number2 > 0 || number2 < 0) {
            return number1 / number2;
        } else {
            System.out.println("թիվը 0-ի չի կարող բաժանվել");
        }
        return 0;
    }

    double multiply() {
        return number1 * number2;
    }
}

