package lesson2;

public class IfSample {
    public static void main(String[] args) {
        int x, y, z;
        x = 2;
        y = x * 30; //y = 60
        z = x * y; //z = 120
        if (y < z) {
            System.out.println(x < z);
        } // true
        x = 2 * 60;
        if (x == z) {
            System.out.println(x == z);
        } //true
        if (y > z) {
            System.out.println(y > z);
        } //false
    }
}
