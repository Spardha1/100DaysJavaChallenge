import java.util.Scanner;

public class q27 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("The numbers are in increasing order.");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("The numbers are in decreasing order.");
        } else {
            System.out.println("The numbers are in no order.");
        }
    }
}

