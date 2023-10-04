import java.util.Scanner;
public class Q57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("The cube of " + i + " is: " + cube);
        }
        scanner.close();
    }
}

