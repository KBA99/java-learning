package Section5;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (notInRange(num1)) return false;
        if (notInRange(num2)) return false;
        if (notInRange(num3)) return false;

        return getRightMostDigit(num1) == getRightMostDigit(num2) || getRightMostDigit(num1) == getRightMostDigit(num3) || getRightMostDigit(num2) == getRightMostDigit(num3);
    }

    public static boolean notInRange(int number) {
        return number >= 10 && number <= 1000;
    }

    public static int getRightMostDigit(int number) {
        return number % 10;
    }
}
