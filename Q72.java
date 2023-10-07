import java.util.Scanner;
public class Q72 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a > 0) {
            int digit = a % 10;
            int cube = digit * digit * digit;
            System.out.println(cube);
            a /= 10;
        }
    }
}
