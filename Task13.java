import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        setArrayDiagonal();
    }

    public static void setArrayDiagonal() {
        int[][] arrays = {
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8}
        };

        System.out.println("Исходный массив: ");
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }


        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j) {
                    arrays[i][j] = 1;
                }
            }
        }

        System.out.println("Измененный массив: ");
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}
