
import java.util.Scanner;

public class q23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int monthNumber = sc.nextInt();

        int numberOfDays = 0;

        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = 28;
                break;
            default:
                System.out.println("Invalid month number.");
                break;
        }

        if (numberOfDays != 0) {
            System.out.println("The number of days in the month " + monthNumber + " is: " + numberOfDays);
        }
    }
}

