package Section5;

public class SumOddRange {
    public static boolean isOdd(int number){
        return (number % 2 == 1);
    }

    public static int sumOdd(int start, int end){
        if (start < 0 || end < 0) return -1;
        return (start <= end) ? sumNumbers(start, end) : -1;
    }

    private static int sumNumbers(int start, int end) {
        int initial = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) initial += i;
        }
        return initial;
    }
}
