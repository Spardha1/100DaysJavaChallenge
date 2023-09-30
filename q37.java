 import java.util.Scanner;
public class q37 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Maximum limit: ");
        int maxLimit = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= maxLimit; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i);
            }

            if (count == 10) {
                break;
            }
        }
        sc.close();
    }
}


