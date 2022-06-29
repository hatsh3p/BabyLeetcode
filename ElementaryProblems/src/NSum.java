import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NSum {
    public static void main(String[] args) throws IOException {
        printSum();
        printSumOfMultiplesOfThreeAndFive();
    }

    public static void printSum() throws IOException {
        int num = getNumber();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.printf("\nThe sum of all numbers 0 - %d is %d.", num, sum);
    }

    public static void printSumOfMultiplesOfThreeAndFive() throws IOException {
        int num = getNumber();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (isDivisibleByFive(i) || isDivisibleByThree(i)) {
                sum += i;
            }
        }
        System.out.printf("\nThe sum of numbers divisible by 3, 5 from 0 0 %d is %d.", num, sum);
    }

    private static boolean isDivisibleByFive(int num) {
        return isDivisibleBy(num, 5);
    }

    private static boolean isDivisibleByThree(int num) {
        return isDivisibleBy(num, 3);
    }

    private static boolean isDivisibleBy(int num, int divisor) {
        return (num % divisor) == 0;
    }

    private static int getNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a positive integer: ");
        String string = reader.readLine();
        int num = Integer.parseInt(string);
        return num;
    }

}
