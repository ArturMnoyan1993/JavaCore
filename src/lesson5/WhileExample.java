package lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            System.out.println("պտույտ " + a);
            a--;
        }

        System.out.println();

        int b = 10, c = 20;
        while (++a < --b) ;
        System.out.println("փոփոխականների միջին արժեքը կազմում է " + a);
    }
}
