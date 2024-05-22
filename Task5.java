public class Task5 {
    public static void main(String[] args) {
        System.out.println(
                checkTwoSum(10, 10)
        );
    }

    public static Boolean checkTwoSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
