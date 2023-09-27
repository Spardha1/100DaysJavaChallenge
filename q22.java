import java.util.Scanner;

public class q22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter your year of service: ");
        int yearOfService = sc.nextInt();

        double bonus = 0;
        if (yearOfService > 5) {
            bonus = salary * 0.05;
        }

        double netBonusAmount = salary + bonus;

        System.out.println("The net bonus amount is: " + netBonusAmount);
    }
}
