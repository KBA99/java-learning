package Section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double dec1, double dec2) {
        return ((int) (dec1 * 1000) == (int) (dec2 * 1000));
    }
}
