import java.util.Scanner;

public class q17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char a = scanner.next().charAt(0);
        if (Character.isUpperCase(a)) {
            System.out.println(a + " is an uppercase alphabet.");
        } else if (Character.isLowerCase(a)) {
            System.out.println(a + " is a lowercase alphabet.");
        } else {
            System.out.println(a + " is not an alphabet.");
        }
    }
}
