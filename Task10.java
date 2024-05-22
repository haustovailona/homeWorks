import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        int[] testCase = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swapZeroAndOne(testCase);
    }

    public static void swapZeroAndOne(int[] array) {
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        System.out.print("Измененный массив: ");
        System.out.println(Arrays.toString(array));

    }
}
