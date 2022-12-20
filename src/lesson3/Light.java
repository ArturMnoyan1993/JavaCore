package lesson3;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 18600;
        int days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.println(distance);


    }
}
