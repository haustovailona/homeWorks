import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        createArray(5, 10);
    }

    public static int[] createArray(int len, int initValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initValue;
        }

        System.out.print("Результирующий массив: ");
        System.out.println(Arrays.toString(array));

        return array;
    }
}
