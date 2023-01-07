package lesson5;

public class IfElseExample {
    public static void main(String[] args) {
        int month = 4;
        String season = null;
        if (month == 12 || month == 1 || month == 2) {
            season = "ձմռանը";
        }
        if (month == 3 || month == 4 || month == 5) {
            season = "գարնանը";
        }
        if (month == 6 || month == 7 || month == 8) {
            season = "ամռանը";
        }
        if (month == 9 || month == 10 || month == 11) {
            season = "աշնանը";
        }
        if (month > 12 || month < 1) {
            season = "նման ամիս չկա";
        }
        System.out.println(month + "-րդ ամիսը պատկանում է " + season);
    }
}
