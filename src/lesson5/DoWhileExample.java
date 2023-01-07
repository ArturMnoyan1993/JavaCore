package lesson5;

public class DoWhileExample {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("պտույտ " + n);
            n--;
        } while (n > 0);

        // կարճ գրելաձևը
        // do {
        // System.out.println("պտույտ " + n);
        // } while (n-->0);
    }
}
