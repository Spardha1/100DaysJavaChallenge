import java.util.Scanner;
public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }

            number++;
        }

        sc.close();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

