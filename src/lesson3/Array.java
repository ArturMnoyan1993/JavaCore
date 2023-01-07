package lesson3;

public class Array {
    public static void main(String[] args) {
        int[] month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.print(month_days[3]);

        //int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

        System.out.println();

        int array1[][] = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(array1[i][j] + "  ");
            System.out.println();
        }

        System.out.println();

        int array2[][] = new int[4][];
        array2[0] = new int[1];
        array2[1] = new int[2];
        array2[2] = new int[3];
        array2[3] = new int[4];
        int c = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                array2[i][j] = c;
                c++;
            }
        }
        int i;
        for (i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(array1[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
