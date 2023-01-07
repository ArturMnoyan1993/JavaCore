package lesson5;

import java.sql.SQLOutput;

public class SampleSwitchExample {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                case 3:
                    System.out.println("i = 3");
                    break;
                default:
                    System.out.println("i > 3");
            }
        }

        System.out.println();

        for (int j = 0; j < 12; j++) {
            switch (j) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("j < 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("j < 10");
                    break;
                default:
                    System.out.println("j => 10");
            }
        }

        System.out.println();

        String str = "2";
        switch (str) {
            case "1":
                System.out.print("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            default:
                System.out.println("համընկնում առկա չէ");
        }
    }
}
