import java.util.Scanner;

public class Q74{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = 1634;

        int numberOfDigits = 0;
        int sum = 0;

        while (number > 0) {
            numberOfDigits++;
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (sum == number) {
            System.out.println("Yes, " + number + " is an Armstrong number.");
        } else {
            System.out.println("No, " + number + " is not an Armstrong number.");
        }

        sc.close();
    }
}
