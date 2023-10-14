import java.util.Scanner;
public class q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("First element of the array is: " + arr[0]);
        System.out.println("Last element of the array is: " + arr[n - 1]);

        sc.close();
    }
}

