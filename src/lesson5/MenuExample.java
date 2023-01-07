package lesson5;

public class MenuExample {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Միանալ օպերատորին");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5 for/n");
            System.out.println("Անհրաժեշտ է ընտրել կետերից մեկը");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("-----");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("---");
                System.out.println("---");
                break;
            case '3':
                System.out.println("whilen:\n");
                System.out.println("--------");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("--------");
                System.out.println("--------");
                System.out.println("--------");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("--------");
                System.out.println("--------");
                break;
        }
    }
}
