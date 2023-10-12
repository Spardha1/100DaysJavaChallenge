import java.util.Scanner;

public class q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number);

                if (number == 1) {
                    number = 0;
                } else {
                    number = 1;
                }
            }
            System.out.println();
        }
    }
}
