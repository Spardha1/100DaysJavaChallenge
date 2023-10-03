   import java.util.Scanner;
public class Q53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        scanner.close();

        System.out.println("The sum of the digits of the number is: " + sum);
    }
}
