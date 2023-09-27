import java.util.Scanner;
public class q24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);

        if (Character.isAlphabetic(character)) {
            System.out.println("The character is an alphabet.");
        } else if (Character.isDigit(character)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
    }
}


