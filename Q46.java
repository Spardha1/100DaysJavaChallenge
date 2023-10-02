 import java.util.Scanner;
public class Q46 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}


