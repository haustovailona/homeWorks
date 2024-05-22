public class Task9 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));  // true
        System.out.println(isLeapYear(2024));  // true
        System.out.println(isLeapYear(2200));  // false
    }

    public static Boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
