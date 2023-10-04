import java.util.Scanner;
public class Q60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;
        }
        scanner.close();
        System.out.println("The sum of the cube of numbers from 1 to " + n + " is: " + sum);
    }
}