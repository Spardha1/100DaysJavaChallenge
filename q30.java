import java.util.Scanner;
import java.util.*;

public class q30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int largestNumber = num1;
        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
            largestNumber = num3;
        }
        if (num4 > largestNumber) {
            largestNumber = num4;
        }

        System.out.println("The largest number is " + largestNumber);
    }
}

