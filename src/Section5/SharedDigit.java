package Section5;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99) return false;
        if(num2 < 10 || num2 > 99) return false;

        int firstDigit1 = num1 % 10;
        int secondDigit1 = ((num1 /10) % 10);

        int firstDigit2 = num2 % 10;
        int secondDigit2 = ((num2 /10) % 10);

        if(firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2 || secondDigit1 == firstDigit2 || secondDigit1 == secondDigit2) {
            return true;
        }
        return false;
    }

}
