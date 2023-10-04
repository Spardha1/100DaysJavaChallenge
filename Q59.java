  import java.util.Scanner;
public class Q59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        scanner.close();
        System.out.println("The sum of the multiples of 7 from 1 to " + n + " is: " + sum);
    }
}

