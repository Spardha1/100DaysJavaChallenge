import java.util.Scanner;
public class q31 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two-digit number: ");
        int number = scanner.nextInt();

        
        if (number < 10 || number > 99) {
            System.out.println("The number must be two digits.");
            System.exit(1);
        }

      
        System.out.println("The first digit of the number is: " + (number / 10));
    }
}



