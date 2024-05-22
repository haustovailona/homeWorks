import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        numDoubler();
    }

    public static void numDoubler() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        System.out.print("Измененный массив: ");
        System.out.println(Arrays.toString(array));
    }
}
