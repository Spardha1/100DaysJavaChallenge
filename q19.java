import java.util.Scanner;

public class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
