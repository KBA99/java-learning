package Section5;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;
        if (number < 10) return number * 2;
        int firstNumber = number % 10;

        while (number >= 10) {
            number /=10;
        }

        int lastNumber = number;

        return lastNumber + firstNumber;
    }
}

/*
* Get the first number by doing %10
* While the number 0 divide it by 10
*
*
* */
