import java.util.Scanner;

public class Q77{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i = 2;i<n;i++){
            int c = a+b;
            a = b;
            b = c;

            System.out.print(c+" ");
        }
    }
}