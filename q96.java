import java.util.*;
public class q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        char start = (char) ('A' + n - 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (start + j));
            }
            System.out.println();
        }
    }
}
