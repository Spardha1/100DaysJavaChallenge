 import java.util.Scanner;
public class q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, or /): ");
        char operator = scanner.next().charAt(0);

     
        switch (operator) {
            case '+':
                System.out.println("The sum of the two numbers is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("The difference of the two numbers is: " + (num1 - num2));
                break;
            case '*':
                System.out.println("The product of the two numbers is: " + (num1 * num2));
                break;
            case '/':
                System.out.println("The quotient of the two numbers is: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}


