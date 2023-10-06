import java.util.Scanner;
public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int previous = 0;
        int current = 1;
        for (int i = 1; i <= n; i++) {
            int sum = previous + current;
            System.out.println(sum);
            previous = current;
            current = sum;
        }
    }
}


