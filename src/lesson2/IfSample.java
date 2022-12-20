package lesson2;

public class IfSample {
    public static void main(String[] args) {
        int x, y, z;
        x = 2;
        y = x * 30; //y = 60
        z = x * y; //z = 120
        if (y < z) { // true
            System.out.println(x < z);
        } // եթե փակագծերում գրենք 120 մեծ է 2 կբերի գրվածը, եթե folse չէ
        x = 2 * 60; // true
        if (x == z) {
            System.out.println(x == z);
        }
        if (y > z) {// false
            System.out.println(y > z);
        }
    }
}
