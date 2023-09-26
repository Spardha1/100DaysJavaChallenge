import java.util.Scanner;

public class q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        
        int lastTwoDigits = num % 100;
        System.out.println("The last two digits of the number are: " + lastTwoDigits);
    }
}
