package Section4;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) return false;
        if ((year % 4) != 0) return true;
        if ((year % 100) == 0) return true;
        return (year % 400) == 0;
    }
}
