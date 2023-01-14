package homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        int[] array = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        ArrayUtil au = new ArrayUtil();

        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenCountOfArray(array);
        au.oddCountOfArray(array);

    }
}
