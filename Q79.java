import java.util.Scanner;
public class Q79 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Fibonacci number: ");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        boolean isFibonacci = false;
        while (a <= number) {
            if (a == number) {
                isFibonacci = true;
                break;
            }
            a = b;
            b = a + b;
        }

        if (isFibonacci) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }
}
