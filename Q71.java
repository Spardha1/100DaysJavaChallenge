 import java.util.Scanner;
public class Q71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int sum = 0;

        while (number > 0) {
            count++;
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The number of digits in " + number + " is " + count);
        System.out.println("The sum of the digits in " + number + " is " + sum);
    }
}
