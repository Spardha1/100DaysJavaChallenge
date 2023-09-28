 import java.util.Scanner;
public class q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        while (num >= 10) {
            num /= 10;
        }

        System.out.println("The first digit of the number is " + num);
    }
}

