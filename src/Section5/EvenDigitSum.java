package Section5;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int sum = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            if(tempNumber % 2 == 0) {
                sum += (tempNumber % 10);
            }
            tempNumber /= 10;
            System.out.println(sum);
        }
        return sum;
    }
}
