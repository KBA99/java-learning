package Section5;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        int digitCount = getDigitCount(number);

        int remaining = reverse(number);

        while (remaining > 0) {
            int lastDigit = remaining % 10;

            if (lastDigit == 0) {
                System.out.println("Zero");
            } else if (lastDigit == 1) {
                System.out.println("One");
            } else if (lastDigit == 2) {
                System.out.println("Two");
            } else if (lastDigit == 3) {
                System.out.println("Three");
            } else if (lastDigit == 4) {
                System.out.println("Four");
            } else if (lastDigit == 5) {
                System.out.println("Five");
            } else if (lastDigit == 6) {
                System.out.println("Six");
            } else if (lastDigit == 7) {
                System.out.println("Seven");
            } else if (lastDigit == 8) {
                System.out.println("Eight");
            } else if (lastDigit == 9) {
                System.out.println("Nine");
            }

            remaining = (remaining - lastDigit) / 10;

            digitCount --;
        }

        while (digitCount > 0) {
            System.out.println("Zero");
            digitCount --;
        }
    }

        public static int reverse(int number) {
            boolean negative = number < 0;

            int reverse = 0;
            int remaining =  Math.abs(number);
            int lastDigit;


            while (remaining > 0) {
                lastDigit = remaining % 10;

                reverse = (reverse * 10) + lastDigit;

                remaining = (remaining - lastDigit) / 10;

            }

            if (negative) return -reverse;
            return reverse;
        }

        public static int getDigitCount(int number) {
            if (number < 0) return -1;
            if (number == 0) return 1;
            int digits = 0;

            while (number > 0) {
                number /= 10;
                digits++;

            }

            return digits;
        }
}
