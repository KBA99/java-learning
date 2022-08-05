package Section5;

import java.util.Scanner;

public class MinMax {

    private static int number;

    public static int totalSum(int totalNumbers) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int total = 0;

        while (counter < totalNumbers) {

            System.out.println("Please enter a number");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                total += number;
                counter++;
            } else {
                System.out.println("That is not a valid input, enter an integer");
            }
            scanner.nextLine();
        }
        scanner.close();
        return total;
    }

    public static void minMax() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();

            if(number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

}