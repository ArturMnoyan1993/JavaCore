package homework1;

public class IfForExample4 {
    public static void main(String[] args) {
        int a = 10, c = 0, b = 10 + c;
        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        }
        a = 12;
        if (a > b) {
            System.out.println("a-ն հավասար չէ b-ին");
        }
    }
}
