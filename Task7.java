public class Task7 {
    public static void main(String[] args) {
        System.out.println(
                checkNum(19)
        );
    }

    public static Boolean checkNum(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }
}
