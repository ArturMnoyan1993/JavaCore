package homework1;

public class FigurPainter2 {
    public static void main(String[] args) {
        for (int k = 4; k > 0 ; k--) {
            System.out.print("xy");
            for (int a = 1; a <=k; a++) {
                System.out.print("y");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("y");
            for (int j = 0; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
