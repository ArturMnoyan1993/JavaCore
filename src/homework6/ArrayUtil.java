package homework6;

public class ArrayUtil {
    int[] array = new int[10];

    void maxOfArray(int[] array) {
        int max = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] > max) {
                max = this.array[i];
            }
        }
        System.out.println(max);
    }

    void minOfArray(int[] array) {
        int min = this.array[0];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] < min) {
                min = this.array[i];
            }
        }
        System.out.println(min);
    }

    void evenCountOfArray(int[] array) {
        int evenCount = 0;
        for (int x : this.array) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(+evenCount);
    }

    void oddCountOfArray(int[] array) {
        int oddCount = 0;
        for (int x : this.array) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(+oddCount);
    }
}




