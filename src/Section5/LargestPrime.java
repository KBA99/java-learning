package Section5;

public class LargestPrime {
    public static int getNumberOfFactors(int number) {
        int factors = 0;

        for(int i = 1; i <= number; i ++) {
            if(number % i == 0) factors++;
        }

        return factors;
    }

    public static boolean isPrime(int number) {
        return getNumberOfFactors(number) == 2;
    }

    public static int getLargestPrime(int number){
        if (number < 2) return -1;

        for(int i = number; i >= 2; i --) {
            if(number % i == 0) {
                if(isPrime(i)) return i;
            }
        }
        return -1;
    }

}