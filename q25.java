import java.util.Scanner;
public class q25 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first angle of the triangle: ");
        int angle1 = sc.nextInt();

        System.out.println("Enter the second angle of the triangle: ");
        int angle2 = sc.nextInt();

        System.out.println("Enter the third angle of the triangle: ");
        int angle3 = sc.nextInt();

        boolean isValid = angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 + angle2 + angle3 == 180;

        if (isValid) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}


