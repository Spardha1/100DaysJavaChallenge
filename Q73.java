import java.util.Scanner;
public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int numberOfDigits = countD(number);

        while (number > 0) {
            int digit = number % 10;

            System.out.println(Math.pow(digit, numberOfDigits));

            number /= 10;
        }
        sc.close();
    }
    public static int countD(int a){
        int count = 0;

        while (a > 0) {
            count++;
            a /= 10;
        }

        return count;
    }
}


