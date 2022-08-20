package Section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) number *= -1;

        int reverse = 0;
        int remaining = number;
        int lastDigit;

        while (remaining > 0) {
            lastDigit = remaining % 10;

            reverse = (reverse * 10) + lastDigit;

            remaining = (remaining - lastDigit) / 10;
        }

        return reverse == number;

    }
}

/*
gets the last digit
add the last digit to the stored number
multiply the stored number by 10
divide the number by 10
do this until the number is less than 1
* */