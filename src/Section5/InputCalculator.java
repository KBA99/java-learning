package Section5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println(password);
//
//        int sum = 0;
//        int counter = 0;
//
//        while(scanner.hasNextInt()) {
//            sum+=scanner.nextInt();
//            counter++;
//        }

//        System.out.println("SUM= " + sum + " AVG= " + (double) sum/counter);

        scanner.close();
    }

}
