package Section4;

public class MinutesToSecondYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0 ) {
            System.out.println("Invalid Text");
        } else {
            long YY = (minutes / (60 * 24 * 365));
            long hours = minutes/60;
            long days = hours/24;
            long remainingDays = days%365;
            System.out.println(minutes + " min = " + YY + " y and " + remainingDays + " d");
        }
    }
}
