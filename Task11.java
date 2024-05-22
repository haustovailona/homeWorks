import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        fillNum();
    }

    public static void fillNum() {
        int arraySize = 100;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = i + 1;
        }

        System.out.print("Результирующий массив: ");
        System.out.println(Arrays.toString(array));
    }
}
