import java.util.Scanner;

public class Q80 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end of the range: ");
        int st = sc.nextInt();
        int e = sc.nextInt();
        for (int i = st; i <= e; i++) {
            if (i <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
}
}